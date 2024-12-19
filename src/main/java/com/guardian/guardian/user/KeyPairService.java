package com.guardian.guardian.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Optional;

@Service
public class KeyPairService {

    @Autowired
    private KeyPairRepository keyPairRepository;

    public void saveKeyPair(KeyPair keyPair) {
        KeyPairEntity keyPairEntity = new KeyPairEntity();
        keyPairEntity.setPublicKey(keyPair.getPublic().getEncoded());
        keyPairEntity.setPrivateKey(keyPair.getPrivate().getEncoded());
        keyPairRepository.save(keyPairEntity);
    }

    public KeyPair getKeyPair(Long id) throws Exception {
        Optional<KeyPairEntity> keyPairEntityOptional = keyPairRepository.findById(id);
        if (keyPairEntityOptional.isPresent()) {
            KeyPairEntity keyPairEntity = keyPairEntityOptional.get();
            KeyFactory keyFactory = KeyFactory.getInstance("EC", "BC");

            PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(keyPairEntity.getPublicKey()));
            PrivateKey privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(keyPairEntity.getPrivateKey()));

            return new KeyPair(publicKey, privateKey);
        } else {
            throw new Exception("KeyPair not found");
        }
    }
}
