package com.guardian.guardian.DAO.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserJdbcRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.insert(new User("Evanston","ufhiewbfbef","bdsgfubewgbewi","fdbfk"));
        System.out.println(userRepository.findById(1));

    }
}
