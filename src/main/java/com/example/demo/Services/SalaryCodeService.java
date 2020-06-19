package com.example.demo.Services;

import com.example.demo.Commons.ApiResponse;
import com.example.demo.Commons.Status;
import com.example.demo.DTO.SalaryCodeDTO;
import com.example.demo.Models.Allowance;
import com.example.demo.Models.SalaryCode;
import com.example.demo.Respositories.AllowanceRepository;
import com.example.demo.Respositories.SalaryCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SalaryCodeService {
    @Autowired
    AllowanceRepository allowanceRepository;

    @Autowired
    SalaryCodeRepository salaryCodeRepository;

    public ApiResponse postSalaryCode(SalaryCodeDTO salaryCodeDTO) {

        SalaryCode salaryCode = new SalaryCode();
        salaryCode.setAllowances(salaryCodeDTO.getAllowances());
        salaryCode.setBasicSalary(salaryCodeDTO.getBasicSalary());
        salaryCode.setCode(salaryCodeDTO.getCode());
        salaryCode.setCodeDescription(salaryCodeDTO.getCodeDescription());
        salaryCode.setGrossAmount(salaryCodeDTO.getGrossAmount());

        salaryCodeRepository.save(salaryCode);
       for(Allowance abc :salaryCodeDTO.getAllowances())
       { Allowance allowance = new Allowance();

           allowance.setAmount(abc.getAmount());
           allowance.setAmountType(abc.getAmountType());
           allowance.setPreFrequency(abc.getPreFrequency());
           allowance.setSalaryCodes(salaryCode);
           allowanceRepository.save(allowance);

       }

       return new ApiResponse(200,"Posted Sucessfully",salaryCode);

    }

    public ApiResponse getSalaryCodes() {

        return new ApiResponse(Status.Status_Ok,"Fetched Sucessfully",salaryCodeRepository.findAll());
    }


    public ApiResponse getSalaryCodeById(Long id) {
        return new ApiResponse(Status.Status_Ok,"Fetched Sucessfully",salaryCodeRepository.findById(id));
    }

    public ApiResponse updateSalaryCode(Long id, SalaryCodeDTO salaryCodeDTO) {
        List<Allowance> allowances = new ArrayList<>();
        SalaryCode salaryCode = new SalaryCode();
        salaryCode.setCode(salaryCodeDTO.getCode());
        salaryCode.setGrossAmount(salaryCodeDTO.getGrossAmount());
        salaryCode.setCodeDescription(salaryCodeDTO.getCodeDescription());
        salaryCode.setBasicSalary(salaryCodeDTO.getBasicSalary());
        salaryCode.setId(id);
        Allowance allowance = new Allowance();
        Integer i=0;
        List<Allowance> repoAllowances=this.getBySalaryId(id);
        for(Allowance abc :salaryCodeDTO.getAllowances())
        {

            allowance.setAllowanceId(repoAllowances.get(i).getAllowanceId());
            allowance.setAmount(abc.getAmount());
            allowance.setAmountType(abc.getAmountType());
            allowance.setPreFrequency(abc.getPreFrequency());
            allowance.setSalaryCodes(salaryCode);
            allowances.add(allowance);
            allowanceRepository.save(allowance);
            i++;

        }
        salaryCode.setAllowances(allowances);
        salaryCodeRepository.save(salaryCode);



        return  new ApiResponse(Status.Status_Ok,"Upated Sucessfully ",salaryCodeRepository.findById(id));
    }

    public ApiResponse deleteSalary(Long id) {
//
        SalaryCode salaryCode;
        Optional<SalaryCode> optional = salaryCodeRepository.findById(id);
        if(optional.get()==null)
        {
            return  new ApiResponse(Status.Status_ERROR,"Not Found ",null);
        }
        else{
        salaryCode  = optional.get();

        for (Allowance allowance:salaryCode.getAllowances())
        {
            allowanceRepository.deleteById(allowance.getAllowanceId());
        }
            salaryCodeRepository.deleteById(id);

        return  new ApiResponse(Status.Status_Ok,"Deleted Sucessfully ",salaryCodeRepository.findAll());
        }

    }

    public ApiResponse deleteAll() {
        allowanceRepository.deleteAll();;
        salaryCodeRepository.deleteAll();
        return  new ApiResponse(Status.Status_Ok,"Deleted Sucessfully ",salaryCodeRepository.findAll());

    }

    public List<Allowance> getBySalaryId(Long id){
       return allowanceRepository.getBYSalaryID(id);

    }
}
