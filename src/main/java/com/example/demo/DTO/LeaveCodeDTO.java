package com.example.demo.DTO;

public class LeaveCodeDTO {
    String leaveCode;
    String maxLeaves;

    public LeaveCodeDTO() {
    }

    public LeaveCodeDTO(String leaveCode, String maxLeaves) {
        this.leaveCode = leaveCode;
        this.maxLeaves = maxLeaves;
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
