package com.example.demo.Respositories;

import com.example.demo.Models.SalaryCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryCodeRepository extends JpaRepository<SalaryCode,Long> {
}
