package com.guardian.guardian.UserDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = "INSERT INTO `user` (id,name,privateKey,publicKey,creditCardToken) VALUES (?, ?, ?,?,?)";

    public void insert(User user) {
        springJdbcTemplate.update(INSERT_QUERY,
                user.getId(),user.getName(),user.getPrivateKey(),user.getPublicKey(),user.getCreditCardToken());
    }


}
