package com.guardian.guardian.user;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Arrays;

@Entity
@Data
public class KeyPairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] publicKey;

    @Lob
    private byte[] privateKey;

    // Getters and Setters

    public KeyPairEntity() {
    }

    public KeyPairEntity(Long id, byte[] publicKey, byte[] privateKey) {
        super();
        this.id = id;
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(byte[] publicKey) {
        this.publicKey = publicKey;
    }

    public byte[] getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(byte[] privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public String toString() {
        return "KeyPairEntity{" +
                "id=" + id +
                ", publicKey=" + Arrays.toString(publicKey) +
                ", privateKey=" + Arrays.toString(privateKey) +
                '}';
    }
}
