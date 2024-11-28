package com.jobapplication.model;

public class PositionDetails {
    public int id;
    public String position;
    public int yearOfExperience;
    public int lastSalary;
    public String appliedPosition;

    @Override
    public String toString() {
        return "PositionDetails{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", yearOfExperience='" + yearOfExperience + '\'' +
                ", lastSalary=" + lastSalary +
                ", appliedPosition='" + appliedPosition + '\'' +
                '}';
    }
}
