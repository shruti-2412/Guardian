package com.guardian.guardian.user;

import com.guardian.guardian.Util.ECCEncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.KeyPair;

@RestController
public class ECCController {

    @Autowired
    private KeyPairService keyPairService;

    @GetMapping("/generate")
    public String generateKeyPair() {
        try {
            KeyPair keyPair = ECCEncryptionUtil.generateECCKeyPair();
            keyPairService.saveKeyPair(keyPair);
            return "Key Pair generated and saved!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error generating key pair: " + e.getMessage();
        }
    }

    @GetMapping("/retrieve")
    public String retrieveKeyPair(Long id) {
        try {
            KeyPair keyPair = keyPairService.getKeyPair(id);
            return "Key Pair retrieved!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error retrieving key pair: " + e.getMessage();
        }
    }
}
