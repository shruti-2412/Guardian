package com.guardian.guardian.Domain;

import lombok.Data;

@Data
public class CreditCard {
    private String name;
    private String cardNo;
    private String issueDate;
    private String expiryDate;
    private String cvv;
    private String publicKey;

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", publicKey='" + publicKey + '\'' +
                '}';
    }
}
