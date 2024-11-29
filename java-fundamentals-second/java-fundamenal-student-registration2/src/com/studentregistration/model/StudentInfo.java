package com.studentregistration.model;

public class StudentInfo {
     public int id;
     public String fName;
     public String lName;
     public String gender;
     public long contactNo;
     public String emailId;

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNo=" + contactNo +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
