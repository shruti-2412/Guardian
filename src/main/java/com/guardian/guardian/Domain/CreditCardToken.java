package com.guardian.guardian.Domain;

public class CreditCardToken {

    String encryptedData;
    String bankId;
    String bankName;
    String bankPubKey;

    public CreditCardToken() {
    }

    public CreditCardToken(String encryptedData, String bankId, String bankName, String bankPubKey) {
        this.encryptedData = encryptedData;
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankPubKey = bankPubKey;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankPubKey() {
        return bankPubKey;
    }

    public void setBankPubKey(String bankPubKey) {
        this.bankPubKey = bankPubKey;
    }

    @Override
    public String toString() {
        return "CreditCardToken{" +
                "encryptedData='" + encryptedData + '\'' +
                ", bankId='" + bankId + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankPubKey='" + bankPubKey + '\'' +
                '}';
    }
}
