package com.guardian.guardian.UserDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserJdbcRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.insert(new User(1,"Evanston","ufhiewbfbef","bdsgfubewgbewi","fdbfk"));

    }
}
