package com.guardian.guardian.UserDb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private long id;
    private String name;
    private String privateKey;
    private String publicKey;
    private String creditCardToken;

    public User() {
    }

    public User(long id, String name, String privateKey, String publicKey, String creditCardToken) {
        this.id = id;
        this.name = name;
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.creditCardToken = creditCardToken;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getCreditCardToken() {
        return creditCardToken;
    }

    public void setCreditCardToken(String creditCardToken) {
        this.creditCardToken = creditCardToken;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", privateKey='" + privateKey + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", creditCardToken='" + creditCardToken + '\'' +
                '}';
    }
}
