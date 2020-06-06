package com.example.demo.DTO;

public class SalaryCodeDTO {
    String salaryCode;
    Long basicSalary;
    String codeDescription;
    Long grossAmount;

    public SalaryCodeDTO() {
    }

    public SalaryCodeDTO(String salaryCode, Long basicSalary, String codeDescription, Long grossAmount) {
        this.salaryCode = salaryCode;
        this.basicSalary = basicSalary;
        this.codeDescription = codeDescription;
        this.grossAmount = grossAmount;
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
