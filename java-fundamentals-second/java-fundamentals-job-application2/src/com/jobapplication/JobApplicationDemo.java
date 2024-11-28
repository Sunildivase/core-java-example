package com.jobapplication;

import com.jobapplication.model.EducationDetails;
import com.jobapplication.model.EmployeeDetails;
import com.jobapplication.model.PositionDetails;
import com.jobapplication.service.EducationService;
import com.jobapplication.service.EmployeeService;
import com.jobapplication.service.PositionService;

public class JobApplicationDemo {
    public static void main(String[] args) {

        System.out.println("*** Job Application ***");

        EmployeeService employeeservice = new EmployeeService();
        EmployeeDetails employeedetails = employeeservice.acceptEmployeeData();

        EducationService educationservice = new EducationService();
        EducationDetails educationdetails= educationservice.acceptEducationData();

        PositionService positionservice = new PositionService();
        PositionDetails positiondetails = positionservice.acceptPositionData();

        // all processing complete

        // print

        System.out.println("employee details"+employeedetails);
        System.out.println("education details"+educationdetails);
        System.out.println("position details"+positiondetails);
    }
}
