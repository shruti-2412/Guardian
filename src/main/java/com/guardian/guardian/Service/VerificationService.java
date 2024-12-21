package com.guardian.guardian.Service;

import com.guardian.guardian.Util.ECCEncryptionUtil;
import com.guardian.guardian.Util.ECCVerificationUtil;
import org.springframework.stereotype.Component;

import java.security.KeyPair;

@Component
public class VerificationService {

    public String generateSignature(String data) throws Exception {

        KeyPair keyPairOriginal= ECCEncryptionUtil.generateECCKeyPair();
        byte[] signatureOriginal = ECCVerificationUtil.sign(keyPairOriginal.getPrivate(), data);

        System.out.println("Data: " + data);

        System.out.println("Signing with correct private key: " );
        System.out.println("Signature:" + signatureOriginal);
        System.out.println("Verfiying data is sent from correct source " + ECCVerificationUtil.verify(keyPairOriginal.getPublic(), data,signatureOriginal));

        KeyPair keyPairFake= ECCEncryptionUtil.generateECCKeyPair();
        System.out.println("Signing with incorrect private key: " );
        byte[] signatureFake = ECCVerificationUtil.sign(keyPairFake.getPrivate(), data);
        System.out.println("Signature:" + signatureFake);
        System.out.println("Verfiying data is sent from correct source " + ECCVerificationUtil.verify(keyPairOriginal.getPublic(), data,signatureFake));



        return ECCVerificationUtil.verify(keyPairOriginal.getPublic(), data,signatureOriginal) ? "Signature verified": "Signature not verified";





    }
}
