package com.studentregistration.model;

public class CourseInfo {

    public int id;
    public String courseName;
    public String courseDuration;
    public String startDate;

    @Override
    public String toString() {
        return "CourseInfo{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
