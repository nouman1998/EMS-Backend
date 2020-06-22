package com.example.demo.Controllers;


import com.example.demo.Commons.ApiResponse;
import com.example.demo.Services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    DashboardService dashboardService;

    @GetMapping("/totalemp")
    public ApiResponse getTotalEmployeeCount(){
        return dashboardService.getTotalEmployeeCount();
    }

    @GetMapping("/totaldept")
    public ApiResponse getTotalDepartmentCount(){
        return dashboardService.getTotalDepartmentCount();
    }

    @GetMapping("/totalsalaries")
    public ApiResponse getTotalSumOfSalaries(){
        return dashboardService.getTotalSumOfSalaries();
    }

    @GetMapping("/totalsalarycode")
    public ApiResponse getTotalSalaryCodeCount(){
        return dashboardService.getTotalSalaryCodeCount();
    }

    @GetMapping("/totalleavecode")
    public ApiResponse getTotalLeaveCodeCount(){
        return dashboardService.getTotalLeaveCodeCount();
    }

    @GetMapping("/totaljobcode")
    public ApiResponse getTotalJobCodeCount(){
        return dashboardService.getTotalJobCodeCount();
    }


}
