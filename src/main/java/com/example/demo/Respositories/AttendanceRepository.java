package com.example.demo.Respositories;

import com.example.demo.Models.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance,Long> {

    @Query(value = " Select * from ems.attendance where employee_id = :id AND date = :date ",nativeQuery = true)
    public List<Attendance> getDuplicateAttendance(Long id, String date);
}
