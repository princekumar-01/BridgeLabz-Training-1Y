// com/university/department/cse/Course.java
package com.university.department.cse;

public class Course {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public void printCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Code : " + courseCode);
        System.out.println("Credits     : " + credits);
    }
}


// MainApp.java (default package)
import com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", "CSE201", 4);
        c1.printCourseDetails();

        System.out.println();

        Course c2 = new Course("Operating Systems", "CSE301", 3);
        c2.printCourseDetails();
    }
}
