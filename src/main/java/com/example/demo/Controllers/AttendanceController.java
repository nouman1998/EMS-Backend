package com.example.demo.Controllers;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.DTO.AttendanceDTO;
import com.example.demo.Services.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/attendance")
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;
    @PostMapping("/post")
    public ApiResponse postAttendance(@RequestBody AttendanceDTO attendanceDTO){
        return attendanceService.postAttendance(attendanceDTO);
    }
}
