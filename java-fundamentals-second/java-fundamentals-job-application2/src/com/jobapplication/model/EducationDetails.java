package com.jobapplication.model;


public class EducationDetails {

   public int id;
   public String education;
   public String percentage;
   public String yearOfPassing;
   public String university;

    @Override
    public String toString() {
        return "EducationDetails{" +
                "id=" + id +
                ", education='" + education + '\'' +
                ", percentage='" + percentage + '\'' +
                ", yearOfPassing='" + yearOfPassing + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
