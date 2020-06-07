package com.example.demo.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Long mobileNumber;
    String email;
    String address;
    Long pay;
    String resume;
    Long allowances;


    @ManyToOne()
    private Department depart;

    @ManyToOne
    private SalaryCode salaryCode;

    @ManyToOne
    private Job job;


    public Employee() {
    }

    public Employee(Long id, String name, Long mobileNumber, String email, String address, Long pay, String resume, Long allowances, Department depart, SalaryCode salaryCode, Job job) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.pay = pay;
        this.resume = resume;
        this.allowances = allowances;
        this.depart = depart;
        this.salaryCode = salaryCode;
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPay() {
        return pay;
    }

    public void setPay(Long pay) {
        this.pay = pay;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Long getAllowances() {
        return allowances;
    }

    public void setAllowances(Long allowances) {
        this.allowances = allowances;
    }


    public Department getDepart() {
        return depart;
    }

    public void setDepart(Department depart) {
        this.depart = depart;
    }

    public SalaryCode getSalaryCode() {
        return salaryCode;
    }

    public void setSalaryCode(SalaryCode salaryCode) {
        this.salaryCode = salaryCode;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
