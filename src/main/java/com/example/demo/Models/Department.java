package com.example.demo.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String desription;

@OneToMany(mappedBy = "depart")
private List<Employee> emp;

    public Department() {
    }



    public Department(Long id, String name, String desription, List<Employee> emp) {
        this.id = id;
        this.name = name;
        this.desription = desription;
        this.emp = emp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

//    public List<Employee> getEmp() {
//        return emp;
//    }
//
//    public void setEmp(List<Employee> emp) {
//        this.emp = emp;
//    }
}

