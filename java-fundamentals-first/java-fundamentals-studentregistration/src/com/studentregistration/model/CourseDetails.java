package com.studentregistration.model;

public class CourseDetails {

   public String courseName;
   public String courseDuration;

    @Override
    public String toString() {
        return "CourseDetails{" +
                "courseName='" + courseName + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                '}';
    }
}
