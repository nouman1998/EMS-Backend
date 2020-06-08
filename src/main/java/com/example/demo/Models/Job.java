package com.example.demo.Models;



import javax.persistence.*;
import java.util.List;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String jobCode;
    String jobTitle;
    String jobRole;
    String jobDuties;
    String jobDescription;

    @OneToMany(mappedBy = "job")
    private List<Employee> emp;

    public Job() {
    }


    public Job(Long id, String jobCode, String jobTitle, String jobRole, String jobDuties, String jobDescription, List<Employee> emp) {
        this.id = id;
        this.jobCode = jobCode;
        this.jobTitle = jobTitle;
        this.jobRole = jobRole;
        this.jobDuties = jobDuties;
        this.jobDescription = jobDescription;
        this.emp = emp;
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
}
