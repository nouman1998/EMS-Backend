package com.example.demo.Services;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.Commons.Status;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.Models.Employee;
import com.example.demo.Respositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public ApiResponse postEmployee(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setMobileNumber(employeeDTO.getMobileNumber());
        employee.setEmail(employeeDTO.getEmail());
        employee.setAddress(employeeDTO.getAddress());
        employee.setPay(employeeDTO.getPay());
        employee.setResume(employeeDTO.getResume());
        employee.setDepart(employeeDTO.getDepart());
        employee.setJob(employeeDTO.getJob());
        employee.setSalaryCode(employeeDTO.getSalaryCode());
        employee.setLeaveCode(employeeDTO.getLeaveCode());

        employeeRepository.save(employee);

        return new ApiResponse(Status.Status_Ok,"Successfully Saved",employee);
    }
}
