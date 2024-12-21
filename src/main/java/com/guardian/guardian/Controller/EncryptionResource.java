package com.guardian.guardian.Controller;

import com.guardian.guardian.Domain.CreditCard;
import com.guardian.guardian.Domain.CreditCardToken;
import com.guardian.guardian.Service.EncryptionService;
import com.guardian.guardian.Service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
public class EncryptionResource {

    private final EncryptionService encryptionService;
    private final VerificationService verificationService;

    @Autowired
    public EncryptionResource( EncryptionService encryptionService, VerificationService verificationService) {
        super();
        this.encryptionService = encryptionService;
        this.verificationService=verificationService;
    }

    @RequestMapping(value="/create-token",method=RequestMethod.POST)
    public String encrypt(@RequestBody CreditCard creditCard) {
        try {
            return encryptionService.createToken(creditCard);
        } catch (Exception e) {
            return "Error: " + e.getMessage(); }
    }

    @RequestMapping(value="/generate-signature",method=RequestMethod.POST)
    public String generateSignature(@RequestBody CreditCardToken creditCardToken) {
        try {
            String data=creditCardToken.toString();
            return verificationService.generateSignature(data);
        } catch (Exception e) {
            return "Error: " + e.getMessage(); }
    }

}
