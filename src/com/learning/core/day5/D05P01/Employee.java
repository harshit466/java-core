package com.learning.core.day5.D05P01;
import java.util.Random;

class Employee {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;
    private int employeeId;

    public Employee(String name, long phoneNo, String passportNo, int employeeId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
        this.employeeId = employeeId;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public int getVoterId() {
        return voterId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
