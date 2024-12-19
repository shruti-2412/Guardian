package com.guardian.guardian.Util;

import java.security.*;

public class Wallet {

    //users of the network

    // used for encryption/verification
    private PublicKey publicKey;

    //usde for decryption/signing
    private PrivateKey privateKey;

    public Wallet() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        KeyPair keyPair = ECCEncryptionUtil.generateECCKeyPair();
        this.publicKey = keyPair.getPublic();
        this.privateKey = keyPair.getPrivate();
    }
    public PublicKey getPublicKey() {
        return publicKey;
    }
    public PrivateKey getPrivateKey() {
        return privateKey;
    }
}
