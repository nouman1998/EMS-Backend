package com.example.demo.Respositories;

import com.example.demo.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value = "Select count(id) from ems.employee;",nativeQuery = true)
    public long getEmployeeCount();

}
