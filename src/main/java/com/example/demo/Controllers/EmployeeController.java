package com.example.demo.Controllers;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/post")
    public ApiResponse postEmployee(@RequestBody EmployeeDTO employeeDTO){
    return employeeService.postEmployee(employeeDTO);
    }
}
