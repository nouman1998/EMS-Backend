package com.example.demo.Respositories;


import com.example.demo.Models.Allowance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllowanceRepository extends JpaRepository<Allowance,Long> {
}
