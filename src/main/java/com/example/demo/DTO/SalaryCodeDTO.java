package com.example.demo.DTO;

import com.example.demo.Models.Employee;

import java.util.List;

public class SalaryCodeDTO {
    String salaryCode;
    Long basicSalary;
    String codeDescription;
    Long grossAmount;

    private List<Employee> emp;


    public SalaryCodeDTO() {
    }

    public SalaryCodeDTO(String salaryCode, Long basicSalary, String codeDescription, Long grossAmount, List<Employee> emp) {
        this.salaryCode = salaryCode;
        this.basicSalary = basicSalary;
        this.codeDescription = codeDescription;
        this.grossAmount = grossAmount;
        this.emp = emp;
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

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }
}
