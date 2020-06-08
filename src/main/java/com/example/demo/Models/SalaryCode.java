package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class SalaryCode {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String code;
    Long basicSalary;
    String codeDescription;
    Long grossAmount;

    @OneToMany(mappedBy = "salaryCode")
    List<Employee> emp;
    public SalaryCode() {
    }
    @JsonManagedReference
    @OneToMany(mappedBy = "salaryCodes")
    List<Allowance> allowances;


    public SalaryCode(Long id, String code, Long basicSalary, String codeDescription, Long grossAmount, List<Employee> emp, List<Allowance> allowances) {
        this.id = id;
        this.code = code;
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
