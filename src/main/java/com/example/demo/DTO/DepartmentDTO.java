package com.example.demo.DTO;

import com.example.demo.Models.Employee;

import java.util.List;

public class DepartmentDTO {
    String name;
    String description;

    private List<Employee> emp;


    public DepartmentDTO() {
    }


    public DepartmentDTO(String name, String description, List<Employee> emp) {
        this.name = name;
        this.description = description;
        this.emp = emp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }
}
