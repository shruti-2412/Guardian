package com.guardian.guardian.Service;

import com.guardian.guardian.Domain.CreditCard;
import com.guardian.guardian.Util.ECCEncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

@Component
public class EncryptionService {

    @Autowired
    private ECCEncryptionUtil eccEncryptionUtil;
    public String createToken(CreditCard creditCard, String publicKeyStr) throws Exception {

        String data= creditCard.toString();

        try {
            PublicKey publicKey = ECCEncryptionUtil.getPublicKeyFromString(publicKeyStr);
            byte[] encryptedData = ECCEncryptionUtil.encrypt(data, publicKey);
            return Base64.getEncoder().encodeToString(encryptedData);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }


    }
}
