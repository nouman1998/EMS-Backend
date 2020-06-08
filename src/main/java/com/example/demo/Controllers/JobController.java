package com.example.demo.Controllers;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.DTO.JobDTO;
import com.example.demo.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping("/post")
    public ApiResponse postJob(@RequestBody JobDTO jobDTO){
        return jobService.postJob(jobDTO);
    }

    @GetMapping("/")
    public ApiResponse getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public ApiResponse getJobsById(@PathVariable("id") Long id){
        return jobService.getJobsById(id);
    }

    @DeleteMapping("/")
    public ApiResponse deleteAll(){
        return jobService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteJobsById(@PathVariable("id") Long id){
    return jobService.deleteJobsById(id);
    }

    @PutMapping("/{id}")
    public ApiResponse updateJobs(@PathVariable("id") Long id, @RequestBody JobDTO jobDTO){
        return jobService.updateJobs(id,jobDTO);
    }
}
