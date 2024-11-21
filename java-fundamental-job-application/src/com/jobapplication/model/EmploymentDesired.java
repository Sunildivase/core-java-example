package com.jobapplication.model;

public class EmploymentDesired {

    public String positionAppliedFor;
    public String dateOfAvailable;
    public int desiredSalary;

    @Override
    public String toString() {
        return "EmploymentDesired{" +
                "positionAppliedFor='" + positionAppliedFor + '\'' +
                ", dateOfAvailable='" + dateOfAvailable + '\'' +
                ", desiredSalary=" + desiredSalary +
                '}';
    }
}
