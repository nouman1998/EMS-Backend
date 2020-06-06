package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalaryCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String salaryCode;
    Long basicSalary;
    String codeDescription;
    Long grossAmount;

    public SalaryCode() {
    }

    public SalaryCode(Long id, String salaryCode, Long basicSalary, String codeDescription, Long grossAmount) {
        this.id = id;
        this.salaryCode = salaryCode;
        this.basicSalary = basicSalary;
        this.codeDescription = codeDescription;
        this.grossAmount = grossAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSalaryCode() {
        return salaryCode;
    }

    public void setSalaryCode(String salaryCode) {
        this.salaryCode = salaryCode;
    }

    public Long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getCodeDescription() {
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
    }

    public Long getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Long grossAmount) {
        this.grossAmount = grossAmount;
    }
}
