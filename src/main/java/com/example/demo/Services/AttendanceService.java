package com.example.demo.Services;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.Commons.Status;
import com.example.demo.DTO.AttendanceDTO;
import com.example.demo.Models.Attendance;
import com.example.demo.Respositories.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {

    @Autowired
    AttendanceRepository attendanceRepository;

    public ApiResponse postAttendance(AttendanceDTO attendanceDTO) {

        Date today = new Date();
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

        List<Attendance> getAttendanceRecord = attendanceRepository.getDuplicateAttendance(attendanceDTO.getEmployeeId(),formatter.format(today));

        if (getAttendanceRecord.size()>0) {
            return new ApiResponse(Status.Status_DUPLICATE, "Attendance already marked", null);
        } else {
            Attendance attendance = new Attendance();
            attendance.setEmployeeId(attendanceDTO.getEmployeeId());
            attendance.setName(attendanceDTO.getName());
            attendance.setAttendance(attendanceDTO.getAttendance());
            attendance.setDate( formatter.format(today));
            attendanceRepository.save(attendance);
            return new ApiResponse(Status.Status_Ok, "Success", attendance);
        }
    }
}
