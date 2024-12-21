//package com.guardian.guardian.DAO.Govt;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class GovtJdbcRepository {
//
//    @Autowired
//    private JdbcTemplate springJdbcTemplate;
//
//    private static String INSERT_QUERY = "INSERT INTO `govt` (name,publicKey) VALUES (?,?)";
//
//    private static String SELECT_QUERY =
//            """
//                SELECT * FROM `govt`
//                WHERE id = ?;
//             """;
//
//    public void insert(Govt govt) {
//        springJdbcTemplate.update(INSERT_QUERY,
//                govt.getName(),govt.getPublicKey());
//    }
//
//    public Govt findById(long id) {
//        return springJdbcTemplate.queryForObject(SELECT_QUERY,
//                new BeanPropertyRowMapper<>(Govt.class), id);
//    }
//
//
//}
