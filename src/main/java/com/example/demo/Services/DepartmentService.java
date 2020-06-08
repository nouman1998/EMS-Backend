package com.example.demo.Services;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.Commons.Status;
import com.example.demo.DTO.DepartmentDTO;
import com.example.demo.Models.Department;
import com.example.demo.Respositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    public ApiResponse getAllDepartments() {
        return new ApiResponse(Status.Status_Ok,"Fetched Successfully",departmentRepository.findAll())  ;
    }

    public ApiResponse postDepartment(DepartmentDTO departmentDTO) {

        Department dpt = new Department();
        dpt.setDescription(departmentDTO.getDescription());
        dpt.setName(departmentDTO.getName());
        return new ApiResponse(Status.Status_Ok,"Posted Sucessfully",departmentRepository.save(dpt));

    }

    public ApiResponse getById(Long id) {
        return new ApiResponse(Status.Status_Ok,"Fetched Sucessfully",departmentRepository.findById(id));
    }

    public ApiResponse deleteById(Long id) {
        departmentRepository.deleteById(id);
        return new ApiResponse(Status.Status_Ok,"Deleted Sucessfully",departmentRepository.findAll());

    }

    public ApiResponse deleteAll() {
        departmentRepository.deleteAll();
        return new ApiResponse(Status.Status_Ok,"Deleted Sucessfully",departmentRepository.findAll());
    }


    public ApiResponse updateById(Long id , DepartmentDTO departmentDTO) {
        Department dpt = new Department();
        dpt.setId(id);
        dpt.setName(departmentDTO.getName());
        dpt.setDescription(departmentDTO.getDescription());
        departmentRepository.save(dpt);
        return new ApiResponse(Status.Status_Ok,"Updated Successfully",departmentRepository.findById(id));
    }
}
