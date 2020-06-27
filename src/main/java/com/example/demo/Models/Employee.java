package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
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

    String resume;
    String fname;
    String dateOfEntry;


    String dob;
    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    String profile;


    @ManyToOne()
    private Department depart;

//    @JsonBackReference
    @ManyToOne
    private SalaryCode salaryCode;

//    @JsonBackReference
    @ManyToOne
    private Job job;

//    @JsonBackReference
    @ManyToOne
    private LeaveCode leaveCode;


    public Employee() {
    }

    public Employee(Long id, String name, String fname,Long mobileNumber,String profile,String dob, String email, String address,  String resume, Department depart, SalaryCode salaryCode, Job job, LeaveCode leaveCode) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
this.dob=dob;
        this.resume = resume;

        this.depart = depart;
        this.salaryCode = salaryCode;
        this.job = job;
        this.leaveCode =leaveCode;
        this.profile=profile;
        this.fname=fname;
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

//    public Long getPay() {
//        return pay;
//    }
//
//    public void setPay(Long pay) {
//        this.pay = pay;
//    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
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

    public LeaveCode getLeaveCode() {
        return leaveCode;
    }

    public void setLeaveCode(LeaveCode leaveCode) {
        this.leaveCode = leaveCode;
    }
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }
}
