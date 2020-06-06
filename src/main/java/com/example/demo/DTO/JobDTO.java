package com.example.demo.DTO;

public class JobDTO {

    String jobCode;
    String jobTitle;
    String jobRole;
    String jobDuties;
    String jobDescription;

    public JobDTO() {
    }

    public JobDTO(String jobCode, String jobTitle, String jobRole, String jobDuties, String jobDescription) {
        this.jobCode = jobCode;
        this.jobTitle = jobTitle;
        this.jobRole = jobRole;
        this.jobDuties = jobDuties;
        this.jobDescription = jobDescription;
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
