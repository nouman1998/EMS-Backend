package com.example.demo.Controllers;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.DTO.DepartmentDTO;
import com.example.demo.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public ApiResponse getAllDepartments(){
       return departmentService.getAllDepartments();
    }

    @PostMapping("/post")
    public ApiResponse postDepartment(@RequestBody DepartmentDTO departmentDTO){
    return departmentService.postDepartment(departmentDTO);
    }

    @GetMapping("/{id}")
    public ApiResponse getDepartmentById(@PathVariable("id") Long id){
            return departmentService.getById(id);
    }

    @DeleteMapping("{id}")
        public ApiResponse deleteDepartmentById(@PathVariable("id")Long id)
        {
            return departmentService.deleteById(id);
        }

     @DeleteMapping("/")
     public ApiResponse deleteAllDepartment(){
        return departmentService.deleteAll();
     }

     @PutMapping("/{id}")
     public ApiResponse updateById(@PathVariable("id")Long id,@RequestBody DepartmentDTO departmentDTO){
        return departmentService.updateById(id,departmentDTO);
     }
}
