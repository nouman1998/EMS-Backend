package com.example.demo.DTO;

public class AllowanceDTO {
    private String preFrequency;
    private String  amountType;
    private  Integer amount;

    public AllowanceDTO() {
    }

    public AllowanceDTO(String preFrequency, String amountType, Integer amount) {
        this.preFrequency = preFrequency;
        this.amountType = amountType;
        this.amount = amount;
    }

    public String getPreFrequency() {
        return preFrequency;
    }

    public void setPreFrequency(String preFrequency) {
        this.preFrequency = preFrequency;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
