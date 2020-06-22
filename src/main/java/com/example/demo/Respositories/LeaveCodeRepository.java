package com.example.demo.Respositories;

import com.example.demo.Models.LeaveCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveCodeRepository extends JpaRepository<LeaveCode,Long>{

    @Query(value = "Select count(id) from ems.leave_code",nativeQuery = true)
    public Long getLeaveCodeCount();
}
