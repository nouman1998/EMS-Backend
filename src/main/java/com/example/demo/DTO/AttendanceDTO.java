package com.example.demo.DTO;

import java.util.Date;

public class AttendanceDTO {

    Long employeeId;
    String name;
    String attendance;

    public AttendanceDTO() {
    }

    public AttendanceDTO(Long employeeId, String name, String attendance) {
        this.employeeId = employeeId;
        this.name = name;
        this.attendance = attendance;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

}
