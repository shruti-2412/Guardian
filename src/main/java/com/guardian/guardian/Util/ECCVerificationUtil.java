package com.guardian.guardian.Util;

import java.security.PrivateKey;
import java.security.*;

public class ECCVerificationUtil {

    //ECC to sign the given data
    // elliptic curve digital signature algorithm (ECDSA)
    public static byte[] sign(PrivateKey privateKey, String input) {
        Signature signature;
        byte[] output = new byte[0];

        try{
            // we use bouncy castle for ECC
            signature=Signature.getInstance("ECDSA","BC");
            signature.initSign(privateKey);
            signature.update(input.getBytes());
            output=signature.sign();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    //check whether the given data belongs to the sender based on the signature
    public static boolean verify(PublicKey publicKey, String data, byte[] signature) {
        try{
            Signature ecdsaSignature = Signature.getInstance("ECDSA","BC");
            ecdsaSignature.initVerify(publicKey);
            ecdsaSignature.update(data.getBytes());
            return ecdsaSignature.verify(signature);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
