package com.example.demo.Controllers;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.DTO.LeaveCodeDTO;
import com.example.demo.Services.LeaveCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/leavecode")
public class LeaveCodeController {

    @Autowired
    LeaveCodeService leaveCodeService;

    @PostMapping("/post")
    public ApiResponse postLeaveCode(@RequestBody LeaveCodeDTO leaveCodeDTO){
        return leaveCodeService.postLeaveCode(leaveCodeDTO);
    }

    @GetMapping("/")
    public ApiResponse getAllLeaveCode(){
        return leaveCodeService.getAllLeaveCode();
    }

    @GetMapping("/{id}")
    public ApiResponse getLeaveCodeById(@PathVariable("id") Long id){
        return leaveCodeService.getLeaveCodeById(id);
    }

    @DeleteMapping("/")
    public ApiResponse deleteAll(){
        return leaveCodeService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteLeaveCodeById(@PathVariable("id") Long id){
        return leaveCodeService.deleteLeaveCodeById(id);
    }

    @PutMapping("/{id}")
    public ApiResponse updateLeaveCode(@PathVariable("id") Long id, @RequestBody LeaveCodeDTO leaveCodeDTO){
        return leaveCodeService.updateLeaveCode(id,leaveCodeDTO);
    }

}
