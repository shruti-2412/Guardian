package com.guardian.guardian.Service;

import com.guardian.guardian.Domain.CreditCard;
import com.guardian.guardian.UserDb.User;
import com.guardian.guardian.UserDb.UserJdbcRepository;
import com.guardian.guardian.Util.ECCEncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.KeyPair;

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


        String decryptedData= ECCEncryptionUtil.decrypt(encryptedData, keyPair.getPrivate());

        //save it into the database
        System.out.println("Original Data: " + originalData);
        System.out.println("Encrypted Data: " + encryptedData);
        System.out.println("Decrypted Data: " + decryptedData);
        return encryptedData;
    }
}
