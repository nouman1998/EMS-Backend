package com.example.demo.Respositories;

import com.example.demo.Models.SalaryCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryCodeRepository extends JpaRepository<SalaryCode,Long> {

    @Query(value = "Select sum(gross_amount) from ems.salary_code;",nativeQuery = true)
    public Double getTotalSumOfSalaries();

    @Query(value = "Select count(code) from ems.salary_code;",nativeQuery = true)
    public Long getSalaryCodeCount();
}
