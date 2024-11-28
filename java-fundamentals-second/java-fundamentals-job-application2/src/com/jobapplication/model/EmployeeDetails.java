package com.jobapplication.model;

public class EmployeeDetails {

    public int id;
    public String employeeName;
    public String gender;
    public String contactNo;
    public String emailId;

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
