package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeaveCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String leaveCode;
    String maxLeaves;

    public LeaveCode() {
    }

    public LeaveCode(Long id, String leaveCode, String maxLeaves) {
        this.id = id;
        this.leaveCode = leaveCode;
        this.maxLeaves = maxLeaves;
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
}
