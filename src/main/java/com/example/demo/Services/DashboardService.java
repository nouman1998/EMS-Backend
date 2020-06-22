package com.example.demo.Services;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.Commons.Status;
import com.example.demo.Respositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    SalaryCodeRepository salaryCodeRepository;
    @Autowired
    LeaveCodeRepository leaveCodeRepository;
    @Autowired
    JobRepository jobRepository;

    public ApiResponse getTotalEmployeeCount(){
        return new ApiResponse(Status.Status_Ok,"Success",employeeRepository.getEmployeeCount());
    }

    public  ApiResponse getTotalDepartmentCount(){
        return new ApiResponse(Status.Status_Ok,"Success",departmentRepository.getDepartmentCount());
    }

    public ApiResponse getTotalSumOfSalaries(){
        return new ApiResponse(Status.Status_Ok,"Success",salaryCodeRepository.getTotalSumOfSalaries());
    }

    public ApiResponse getTotalSalaryCodeCount(){
        return new ApiResponse(Status.Status_Ok,"Success",salaryCodeRepository.getSalaryCodeCount());
    }

    public ApiResponse getTotalLeaveCodeCount(){
        return new ApiResponse(Status.Status_Ok,"Success",leaveCodeRepository.getLeaveCodeCount());
    }

    public ApiResponse getTotalJobCodeCount(){
        return new ApiResponse(Status.Status_Ok,"Success", jobRepository.getJobCodeCount());
    }
}
