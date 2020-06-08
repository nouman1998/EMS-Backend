package com.example.demo.DTO;

import com.example.demo.Models.Employee;

import java.util.List;

public class LeaveCodeDTO {
    String leaveCode;
    String maxLeaves;

    List<Employee> emp;


    public LeaveCodeDTO() {
    }


    public LeaveCodeDTO(String leaveCode, String maxLeaves, List<Employee> emp) {
        this.leaveCode = leaveCode;
        this.maxLeaves = maxLeaves;
        this.emp = emp;
    }

    public String getLeaveCode() {
        return leaveCode;
    }

    public void setLeaveCode(String leaveCode) {
        this.leaveCode = leaveCode;
    }

    public String getMaxLeaves() {
        return maxLeaves;
    }

    public void setMaxLeaves(String maxLeaves) {
        this.maxLeaves = maxLeaves;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }
}
