package com.example.demo.DTO;

import com.example.demo.Models.Allowance;
import com.example.demo.Models.Employee;

import java.util.List;

public class SalaryCodeDTO {
    String code;
    Long basicSalary;
    String codeDescription;
    Long grossAmount;

    List<Allowance> allowances;
    public SalaryCodeDTO() {
    }

    public SalaryCodeDTO(String code, Long basicSalary, String codeDescription, Long grossAmount) {
        this.code = code;
        this.basicSalary = basicSalary;
        this.codeDescription = codeDescription;
        this.grossAmount = grossAmount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public List<Allowance> getAllowances() {
        return allowances;
    }

    public void setAllowances(List<Allowance> allowances) {
        this.allowances = allowances;
    }
}
