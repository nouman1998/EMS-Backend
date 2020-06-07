package com.example.demo.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class SalaryCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String salaryCode;
    Long basicSalary;
    String codeDescription;
    Long grossAmount;

    @OneToMany(mappedBy = "salaryCode")
    List<Employee> emp;
    public SalaryCode() {
    }

    @OneToMany(mappedBy = "salaryCodes")
    List<Allowance> allowances;


    public SalaryCode(Long id, String salaryCode, Long basicSalary, String codeDescription, Long grossAmount, List<Employee> emp, List<Allowance> allowances) {
        this.id = id;
        this.salaryCode = salaryCode;
        this.basicSalary = basicSalary;
        this.codeDescription = codeDescription;
        this.grossAmount = grossAmount;
        this.emp = emp;
        this.allowances = allowances;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
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

    public List<Allowance> getAllowances() {
        return allowances;
    }

    public void setAllowances(List<Allowance> allowances) {
        this.allowances = allowances;
    }
}
