//package com.guardian.guardian.DAO.Govt;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Govt {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private long id;
//    private String name;
//    private String publicKey;
//
//    public Govt() {
//    }
//
//    public Govt(long id, String name, String publicKey) {
//        this.id = id;
//        this.name = name;
//        this.publicKey = publicKey;
//    }
//
//    public Govt(String name, String publicKey) {
//        this.name = name;
//        this.publicKey = publicKey;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPublicKey() {
//        return publicKey;
//    }
//
//    public void setPublicKey(String publicKey) {
//        this.publicKey = publicKey;
//    }
//
//    @Override
//    public String toString() {
//        return "Govt{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", publicKey='" + publicKey + '\'' +
//                '}';
//    }
//}
