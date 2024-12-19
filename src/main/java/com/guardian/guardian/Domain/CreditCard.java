package com.guardian.guardian.Domain;



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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
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
