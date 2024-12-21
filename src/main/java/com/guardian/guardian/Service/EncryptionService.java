package com.guardian.guardian.Service;

import com.guardian.guardian.Domain.CreditCard;
import com.guardian.guardian.DAO.User.User;
import com.guardian.guardian.DAO.User.UserJdbcRepository;
import com.guardian.guardian.Util.ECCEncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

@Component
public class EncryptionService {

    @Autowired
    private ECCEncryptionUtil eccEncryptionUtil;

    @Autowired
    private UserJdbcRepository userRepository;

    public String createToken(CreditCard creditCard) throws Exception {

        String originalData= creditCard.toString();
        KeyPair keyPair= ECCEncryptionUtil.generateECCKeyPair();
        String privateKeyStr = ECCEncryptionUtil.getPrivateKeyAsString(keyPair.getPrivate());
        String publicKeyStr = ECCEncryptionUtil.getPublicKeyAsString(keyPair.getPublic());

        String encryptedData= ECCEncryptionUtil.encrypt(originalData, keyPair.getPublic());
        userRepository.insert(new User(creditCard.getName(),privateKeyStr,publicKeyStr,encryptedData));
        User user=userRepository.findById(2);
        byte[] privateKeyBytes = Base64.getDecoder().decode(user.getPrivateKey());
        byte[] publicKeyBytes = Base64.getDecoder().decode(user.getPublicKey());

        // Recreate the key pair from bytes (example only, adjust for your key type)
        PrivateKey privateKey = KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(privateKeyBytes));
        PublicKey publicKey = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(publicKeyBytes));

//        String decryptedData= ECCEncryptionUtil.decrypt(encryptedData, keyPair.getPrivate());
        String decryptedData= ECCEncryptionUtil.decrypt(encryptedData, privateKey);

        //save it into the database
        System.out.println("Original Data: " + originalData);
        System.out.println("Encrypted Data: " + encryptedData);
        System.out.println("Decrypted Data: " + decryptedData);
        return encryptedData;
    }
}
