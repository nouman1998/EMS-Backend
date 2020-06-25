package com.example.demo.Services;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.Commons.CustomConstants;
import com.example.demo.Commons.Status;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.Models.Employee;
import com.example.demo.Respositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import org.springframework.core.io.UrlResource;



@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Value("${employee.resume.url}")
    String employeeResumeURL;

    @Value("${employee.profile.url}")
    String employeeProfileURL;


    public ApiResponse postEmployee(EmployeeDTO employeeDTO){
        String unique = String.valueOf(new Timestamp(System.currentTimeMillis()).getTime());
        if(saveProductImage(employeeDTO.getResume(),"Resume",unique)&&saveProfileImage(employeeDTO.getProfile(),"Profile",unique))
        {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setMobileNumber(employeeDTO.getMobileNumber());
        employee.setEmail(employeeDTO.getEmail());
        employee.setAddress(employeeDTO.getAddress());
//        employee.setPay(employeeDTO.getPay());
        employee.setResume(employeeResumeURL+"Resume/"+employeeDTO.getResume().getOriginalFilename());//
            employee.setProfile(employeeProfileURL+"Profile/"+employeeDTO.getProfile().getOriginalFilename());
        employee.setDepart(employeeDTO.getDepart());
        employee.setJob(employeeDTO.getJob());
        employee.setFname(employeeDTO.getFname());
        employee.setDob(employeeDTO.getDob());

        employee.setSalaryCode(employeeDTO.getSalaryCode());
        employee.setLeaveCode(employeeDTO.getLeaveCode());

        employeeRepository.save(employee);

        return new ApiResponse(Status.Status_Ok,"Successfully Saved",employee);
        }
        else{
            return new ApiResponse(Status.Status_ERROR,"Unsucessfull ",null);
        }

    }


    public Boolean saveProductImage(MultipartFile file, String name, String unique  ){
        try{

            String UPLOADED_FOLDER_NEW = CustomConstants.SERVER_PATH+"//"+"serverFilesPDF//"+name+"//"+"resume"+"//";

            File dir = new File(UPLOADED_FOLDER_NEW);
            dir.setExecutable(true);
            dir.setReadable(true);
            dir.setWritable(true);

            if(!dir.exists()){
                dir.mkdirs();
            }
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER_NEW + unique+ file.getOriginalFilename());
            Files.write(path, bytes);

        }
        catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public Boolean saveProfileImage(MultipartFile file, String name, String unique  ){
        try{

            String UPLOADED_FOLDER_NEW = CustomConstants.SERVER_PATH+"//"+"serverFiles//"+name+"//"+"images"+"//";

            File dir = new File(UPLOADED_FOLDER_NEW);
            dir.setExecutable(true);
            dir.setReadable(true);
            dir.setWritable(true);

            if(!dir.exists()){
                dir.mkdirs();
            }
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER_NEW + unique+ file.getOriginalFilename());
            Files.write(path, bytes);

        }
        catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public ApiResponse getEmployee() {
       return  new ApiResponse(Status.Status_Ok,"Fetched Sucessfully",employeeRepository.findAll());
    }

    public ApiResponse deleteEmp(Long id) {
        employeeRepository.deleteById(id);
            return new ApiResponse(Status.Status_Ok,"Sucessfully Deleted",employeeRepository.findAll());
    }

    public ApiResponse getEmpById(Long id) {
        return  new ApiResponse(Status.Status_Ok,"Fetched Sucessfully",employeeRepository.findById(id));
    }

    public ResponseEntity<InputStreamResource> getProductImage(String filename)throws IOException {
        String filepath = CustomConstants.SERVER_PATH+"//"+"serverFiles//"+"//Resume//"+"//products//"+filename;
        File f = new File(filepath);
        Resource file = new UrlResource(f.toURI());
        return  ResponseEntity
                .ok()
                .contentLength(file.contentLength())
                .contentType(
                        MediaType.parseMediaType("application/pdf"))
                .body(new InputStreamResource(file.getInputStream()));
    }

    public ResponseEntity<InputStreamResource> getProfileImage(String filename) throws  IOException{
        String filepath = CustomConstants.SERVER_PATH+"//"+"serverFiles//"+"//Profile//"+"//images//"+filename;
        File f = new File(filepath);
        Resource file = new UrlResource(f.toURI());
        return  ResponseEntity
                .ok()
                .contentLength(file.contentLength())
                .contentType(
                        MediaType.parseMediaType("image/jpeg"))
                .body(new InputStreamResource(file.getInputStream()));

    }
}
