package com.example.demo.Respositories;

import com.example.demo.Models.LeaveCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveCodeRepository extends JpaRepository<LeaveCode,Long>{
}
