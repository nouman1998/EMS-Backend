package com.example.demo.DTO;

import com.example.demo.Models.Department;
import com.example.demo.Models.Job;
import com.example.demo.Models.LeaveCode;
import com.example.demo.Models.SalaryCode;

public class EmployeeDTO {
    String name;
    Long mobileNumber;
    String email;
    String address;
    Long pay;
    String resume;


    private Department depart;

    private SalaryCode salaryCode;

    private Job job;

    private LeaveCode leaveCode;


    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, Long mobileNumber, String email, String address, Long pay, String resume, Department depart, SalaryCode salaryCode, Job job, LeaveCode leaveCode) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.pay = pay;
        this.resume = resume;
        this.depart = depart;
        this.salaryCode = salaryCode;
        this.job = job;
        this.leaveCode = leaveCode;
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
}
