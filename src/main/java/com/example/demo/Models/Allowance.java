package com.example.demo.Models;

import javax.persistence.*;
import javax.persistence.ManyToOne;

@Entity
public class Allowance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long allowanceId;
    private String preFrequency;
    private String  amountType;
    private  Integer amount;

    @ManyToOne
    private  SalaryCode salaryCodes;


    public Allowance() {
    }

    public Long getAllowanceId() {
        return allowanceId;
    }

    public void setAllowanceId(Long allowanceId) {
        this.allowanceId = allowanceId;
    }

    public Allowance(Long allowanceId, String preFrequency, String amountType, Integer amount, SalaryCode salaryCodes) {
        this.allowanceId = allowanceId;
        this.preFrequency = preFrequency;
        this.amountType = amountType;
        this.amount = amount;
        this.salaryCodes = salaryCodes;
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


    public SalaryCode getSalaryCodes() {
        return salaryCodes;
    }

    public void setSalaryCodes(SalaryCode salaryCodes) {
        this.salaryCodes = salaryCodes;
    }
}
