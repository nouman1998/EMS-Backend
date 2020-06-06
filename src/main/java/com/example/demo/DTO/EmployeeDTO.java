package com.example.demo.DTO;

public class EmployeeDTO {
    String name;
    Long mobileNumber;
    String email;
    String address;
    Long pay;
    String resume;
    Long allowances;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, Long mobileNumber, String email, String address, Long pay, String resume, Long allowances) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.pay = pay;
        this.resume = resume;
        this.allowances = allowances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPay() {
        return pay;
    }

    public void setPay(Long pay) {
        this.pay = pay;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Long getAllowances() {
        return allowances;
    }

    public void setAllowances(Long allowances) {
        this.allowances = allowances;
    }
}
