package com.example.demo.Services;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.Commons.Status;
import com.example.demo.DTO.LeaveCodeDTO;
import com.example.demo.Models.LeaveCode;
import com.example.demo.Respositories.LeaveCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeaveCodeService {

    @Autowired
    LeaveCodeRepository leaveCodeRepository;

    public ApiResponse postLeaveCode(LeaveCodeDTO leaveCodeDTO){
        LeaveCode leaveCode = new LeaveCode();
        leaveCode.setLeaveCode(leaveCodeDTO.getLeaveCode());
        leaveCode.setMaxLeaves(leaveCodeDTO.getMaxLeaves());
        leaveCodeRepository.save(leaveCode);

        return new ApiResponse(Status.Status_Ok,"Successfully Saved",leaveCode);
    }

    public ApiResponse getAllLeaveCode(){
        List<LeaveCode> leaveCodeList = leaveCodeRepository.findAll();
        return new ApiResponse(Status.Status_Ok,"Successfully fetched",leaveCodeList);
    }

    public ApiResponse getLeaveCodeById(Long id){
     Optional<LeaveCode> leaveCode = leaveCodeRepository.findById(id);
     return new ApiResponse(Status.Status_Ok,"Success",leaveCode);
    }

    public ApiResponse deleteAll(){
        leaveCodeRepository.deleteAll();
        return new ApiResponse(Status.Status_Ok,"Deleted Successfully",null);
    }

    public ApiResponse deleteLeaveCodeById(Long id){
        leaveCodeRepository.deleteById(id);
        List<LeaveCode> leaveCodeList = leaveCodeRepository.findAll();
        return new ApiResponse(Status.Status_Ok,"Successfully Deleted",leaveCodeList);
    }

    public ApiResponse updateLeaveCode(Long id, LeaveCodeDTO leaveCodeDTO){
        Optional<LeaveCode> findLeaveCode = leaveCodeRepository.findById(id);
        LeaveCode leaveCode = findLeaveCode.get();
        leaveCode.setLeaveCode(leaveCodeDTO.getLeaveCode());
        leaveCode.setMaxLeaves(leaveCodeDTO.getMaxLeaves());
        leaveCodeRepository.save(leaveCode);

        return new ApiResponse(Status.Status_Ok,"Successfully Updated",leaveCode);
    }
}
