package com.guardian.guardian.Controller;

import com.guardian.guardian.Domain.CreditCard;
import com.guardian.guardian.Service.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@RestController
@Component
public class EncryptionResource {

    @Autowired
    private EncryptionService encryptionService;
    String publicKey= "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEHKj7xq0cB0pORTMnvR0vDCaADA5qm0BjG9TPAjLtwDSaxPl5lU3QUzF2+ZZdroRIIO1xEvGad2vElN2zSSTmUQ==";

    @PostMapping("/create-token")
    public String encrypt(@RequestBody CreditCard creditCard) {
        try {
            return encryptionService.createToken(creditCard, publicKey);
        } catch (Exception e) {
            return "Error: " + e.getMessage(); }
    }
}
