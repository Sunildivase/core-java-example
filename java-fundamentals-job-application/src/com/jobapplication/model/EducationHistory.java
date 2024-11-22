package com.jobapplication.model;

public class EducationHistory {

   public String schoolOrUniversityName;
   public String percentage;
   public String yearOfPassing;

    @Override
    public String toString() {
        return "EducationHistory{" +
                "schoolNameOrUniversity='" + schoolOrUniversityName + '\'' +
                ", percentage='" + percentage + '\'' +
                ", yearOfPassing='" + yearOfPassing + '\'' +
                '}';
    }
}
