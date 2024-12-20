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

    public CreditCard() {
    }

    public CreditCard(String name, String cardNo, String issueDate, String expiryDate, String cvv, String publicKey) {
        super();
        this.name = name;
        this.cardNo = cardNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.publicKey = publicKey;
    }

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
