package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class LeaveCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String leaveCode;
    String maxLeaves;

//    @JsonManagedReference
    @JsonIgnore
    @OneToMany(mappedBy = "leaveCode")
    private List<Employee> emp;

    public LeaveCode() {
    }

    public LeaveCode(Long id, String leaveCode, String maxLeaves, List<Employee> emp) {
        this.id = id;
        this.leaveCode = leaveCode;
        this.maxLeaves = maxLeaves;
        this.emp = emp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
