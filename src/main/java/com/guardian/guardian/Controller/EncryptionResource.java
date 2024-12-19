package com.guardian.guardian.Controller;

import com.guardian.guardian.Domain.CreditCard;
import com.guardian.guardian.Service.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;



@RestController
public class EncryptionResource {


    private EncryptionService encryptionService;

    public EncryptionResource( EncryptionService encryptionService) {
        super();
        this.encryptionService = encryptionService;
    }
    String publicKey= "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEHKj7xq0cB0pORTMnvR0vDCaADA5qm0BjG9TPAjLtwDSaxPl5lU3QUzF2+ZZdroRIIO1xEvGad2vElN2zSSTmUQ==";

    @RequestMapping(value="/create-token",method=RequestMethod.POST)
    public String encrypt(@RequestBody CreditCard creditCard) {
        try {
            return encryptionService.createToken(creditCard, publicKey);
        } catch (Exception e) {
            return "Error: " + e.getMessage(); }
    }
}
