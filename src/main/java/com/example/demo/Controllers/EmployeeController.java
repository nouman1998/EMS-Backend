package com.example.demo.Controllers;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

//import javax.validation.Valid;
@CrossOrigin
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/post")
    public ApiResponse postEmployee(@RequestParam("resume") MultipartFile resume, EmployeeDTO employeeDTO){
        employeeDTO.setResume(resume);
        return employeeService.postEmployee(employeeDTO);
    }
    @GetMapping("/")
    public ApiResponse getEmploye(){
       return employeeService.getEmployee();
    }
    @DeleteMapping("/{id}")
    public ApiResponse deleteEmployee(@PathVariable("id") Long id)
    {
        return employeeService.deleteEmp(id);
    }
    @GetMapping("/{id}")
    public ApiResponse getEmpById(@PathVariable("id") Long id){
        return  employeeService.getEmpById(id);
    };

    @RequestMapping(value ="/resume/Resume/{filename:.+}", method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> getProductImage(@PathVariable("filename") String filename)
            throws IOException {
        return employeeService.getProductImage(filename);
    }
}
