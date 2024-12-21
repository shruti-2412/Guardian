package com.guardian.guardian.DAO.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = "INSERT INTO `user` (name,privateKey,publicKey,creditCardToken) VALUES (?, ?,?,?)";

    private static String SELECT_QUERY =
            """
                SELECT * FROM `user` 
                WHERE id = ?;
             """;

    public void insert(User user) {
        springJdbcTemplate.update(INSERT_QUERY,
                user.getName(),user.getPrivateKey(),user.getPublicKey(),user.getCreditCardToken());
    }

    public User findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(User.class), id);
    }


}
