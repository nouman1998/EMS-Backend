package com.example.demo.Controllers;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.DTO.SalaryCodeDTO;
import com.example.demo.Models.SalaryCode;
import com.example.demo.Services.SalaryCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/salary-code")
public class SalaryCodeController {
@Autowired
    SalaryCodeService salaryCodeService;

    @PostMapping("/post")
    public ApiResponse postSalaryCode(@RequestBody SalaryCodeDTO salaryCodeDTO) {
        return salaryCodeService.postSalaryCode(salaryCodeDTO);
    }

    @GetMapping("/")
    public ApiResponse getSalaryCode(){
        return  salaryCodeService.getSalaryCodes();
    }

    @GetMapping("/{id}")
    public ApiResponse getSalaryById(@PathVariable("id") Long id){
        return  salaryCodeService.getSalaryCodeById(id);
    }


    @PutMapping("/{id}")
    public ApiResponse updateSalary(@PathVariable("id")Long id , @RequestBody SalaryCodeDTO salaryCodeDTO)
    {
        return salaryCodeService.updateSalaryCode(id,salaryCodeDTO);
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteSalary(@PathVariable("id") Long id)
    {
        return salaryCodeService.deleteSalary(id);
    }

    @DeleteMapping("/")
    public  ApiResponse deleteAllSalary(){
        return salaryCodeService.deleteAll();
    }


}
