package com.guardian.guardian.Controller;

import com.guardian.guardian.Domain.CreditCard;
import com.guardian.guardian.Service.EncryptionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EncryptionResource {

    private final EncryptionService encryptionService;

    public EncryptionResource( EncryptionService encryptionService) {
        super();
        this.encryptionService = encryptionService;
    }

    @RequestMapping(value="/create-token",method=RequestMethod.POST)
    public String encrypt(@RequestBody CreditCard creditCard) {
        try {
            return encryptionService.createToken(creditCard);
        } catch (Exception e) {
            return "Error: " + e.getMessage(); }
    }
}
