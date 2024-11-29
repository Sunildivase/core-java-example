package com.studentregistration;

import com.studentregistration.model.CourseInfo;
import com.studentregistration.model.FeeDetails;
import com.studentregistration.model.StudentInfo;
import com.studentregistration.service.CourseInfoService;
import com.studentregistration.service.FeeDetailsService;
import com.studentregistration.service.StudentInfoService;

public class StudentRegistrationDemo {

    public static void main(String[] args) {

        System.out.println("*** Student Registration ***");

        StudentInfoService studentservice = new StudentInfoService();
        StudentInfo studentdetails = studentservice.acceptStudentData();

        CourseInfoService courseservice = new CourseInfoService();
        CourseInfo coursedetails = courseservice.acceptCourseData();

        FeeDetailsService feeservice = new FeeDetailsService();
        FeeDetails feedetails = feeservice.acceptFeeData();

        //all processing complete
        // print

        System.out.println("student information: "+ studentdetails);
        System.out.println("course information: "+coursedetails);
        System.out.println("fee details:"+feedetails);
    }
}
