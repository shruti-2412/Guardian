package com.guardian.guardian.Service;

import com.guardian.guardian.Domain.CreditCard;
import com.guardian.guardian.Util.ECCEncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.KeyPair;

@Component
public class EncryptionService {

    @Autowired
    private ECCEncryptionUtil eccEncryptionUtil;

    public String createToken(CreditCard creditCard) throws Exception {

        String originalData= creditCard.toString();
        KeyPair keyPair= ECCEncryptionUtil.generateECCKeyPair();
        String encryptedData= ECCEncryptionUtil.encrypt(originalData, keyPair.getPublic());
        String decryptedData= ECCEncryptionUtil.decrypt(encryptedData, keyPair.getPrivate());
        //save it into the database
        System.out.println("Original Data: " + originalData);
        System.out.println("Encrypted Data: " + encryptedData);
        System.out.println("Decrypted Data: " + decryptedData);
        return encryptedData;
    }
}
