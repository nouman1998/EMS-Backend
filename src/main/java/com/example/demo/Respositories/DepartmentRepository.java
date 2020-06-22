package com.example.demo.Respositories;

import com.example.demo.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    @Query(value = "Select count(id) from ems.department",nativeQuery = true)
    public long getDepartmentCount();
}
