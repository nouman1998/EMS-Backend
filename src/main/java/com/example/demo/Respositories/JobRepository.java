package com.example.demo.Respositories;

import com.example.demo.Models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {

    public Job findJobByJobCode(String jobCode);

    @Query(value = "Select count(id) from ems.job", nativeQuery = true)
    public Long getJobCodeCount();


}
