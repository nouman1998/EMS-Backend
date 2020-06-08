package com.example.demo.Services;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.Commons.CustomConstants;
import com.example.demo.Commons.Status;
import com.example.demo.DTO.JobDTO;
import com.example.demo.Models.Job;
import com.example.demo.Respositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public ApiResponse postJob(JobDTO jobDTO) {

        Job jobCode = jobRepository.findJobByJobCode(jobDTO.getJobCode());
        if (jobCode != null) {
            return new ApiResponse(Status.Status_DUPLICATE, "Duplicate", null);
        } else {
            Job job = new Job();
            job.setJobCode(jobDTO.getJobCode());
            job.setJobTitle(jobDTO.getJobTitle());
            job.setJobRole(jobDTO.getJobRole());
            job.setJobDuties(jobDTO.getJobDuties());
            job.setJobDescription(jobDTO.getJobDescription());
            jobRepository.save(job);

            return new ApiResponse(Status.Status_Ok, "Successfully Added job", job);
        }
    }

    public ApiResponse getAllJobs(){
        List<Job> jobList = jobRepository.findAll();
        return new ApiResponse(Status.Status_Ok,"Successfully Fetched",jobList);
    }

    public ApiResponse getJobsById(Long id){
        Optional<Job> jobOptional = jobRepository.findById(id);
        return new ApiResponse(Status.Status_Ok,"Success",jobOptional);
    }

    public ApiResponse deleteAll(){
        jobRepository.deleteAll();
        return new ApiResponse(Status.Status_Ok,"Successfully Deleted",null);
    }

    public ApiResponse deleteJobsById(Long id){
        jobRepository.deleteById(id);
        List<Job> jobList = jobRepository.findAll();
        return new ApiResponse(Status.Status_Ok,"Deleted Successfully", jobList);
    }

    public ApiResponse updateJobs(Long id, JobDTO jobDTO){

        Optional<Job> jobOptional = jobRepository.findById(id);
        Job job = jobOptional.get();
        job.setJobCode(jobDTO.getJobCode());
        job.setJobTitle(jobDTO.getJobTitle());
        job.setJobRole(jobDTO.getJobRole());
        job.setJobDuties(jobDTO.getJobDuties());
        job.setJobDescription(jobDTO.getJobDescription());

        jobRepository.save(job);

        return new ApiResponse(Status.Status_Ok,"Updated Successfully",job);




    }
}
