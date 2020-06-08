package com.example.demo.DTO;

import com.example.demo.Models.Employee;

import java.util.List;

public class JobDTO {

    String jobCode;
    String jobTitle;
    String jobRole;
    String jobDuties;
    String jobDescription;

    private List<Employee> emp;


    public JobDTO() {
    }

    public JobDTO(String jobCode, String jobTitle, String jobRole, String jobDuties, String jobDescription, List<Employee> emp) {
        this.jobCode = jobCode;
        this.jobTitle = jobTitle;
        this.jobRole = jobRole;
        this.jobDuties = jobDuties;
        this.jobDescription = jobDescription;
        this.emp = emp;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobDuties() {
        return jobDuties;
    }

    public void setJobDuties(String jobDuties) {
        this.jobDuties = jobDuties;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }
}
