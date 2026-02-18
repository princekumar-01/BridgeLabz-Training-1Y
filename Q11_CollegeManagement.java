// college/student/Student.java
package college.student;

public class Student {
    private int rollNumber;
    private String name;
    private String branch;
    private double cgpa;

    public Student(int rollNumber, String name, String branch, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public void displayInfo() {
        System.out.println("Roll: " + rollNumber + " | Name: " + name + " | Branch: " + branch + " | CGPA: " + cgpa);
    }
}


// college/faculty/Faculty.java
package college.faculty;

public class Faculty {
    private int employeeId;
    private String name;
    private String designation;
    private String subject;

    public Faculty(int employeeId, String name, String designation, String subject) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.subject = subject;
    }

    public void displayInfo() {
        System.out.println("ID: " + employeeId + " | Name: " + name + " | " + designation + " | " + subject);
    }
}


// college/department/Department.java
package college.department;

public class Department {
    private String deptCode;
    private String deptName;
    private int totalSeats;
    private String hod;

    public Department(String deptCode, String deptName, int totalSeats, String hod) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.totalSeats = totalSeats;
        this.hod = hod;
    }

    public void displayInfo() {
        System.out.println("[" + deptCode + "] " + deptName + " | Seats: " + totalSeats + " | HOD: " + hod);
    }
}


// college/main/CollegeMainApp.java
package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;
import static java.lang.Math.*;

public class CollegeMainApp {
    public static void main(String[] args) {
        System.out.println("=== Departments ===");
        Department[] departments = {
            new Department("CSE", "Computer Science", 120, "Dr. Alan Turing"),
            new Department("ECE", "Electronics",      90,  "Dr. Grace Hopper")
        };
        for (Department d : departments) d.displayInfo();

        System.out.println("\n=== Students ===");
        Student[] students = {
            new Student(101, "Alice Johnson",  "CSE", 9.2),
            new Student(102, "Bob Martinez",   "ECE", 8.5),
            new Student(103, "Carol Williams", "CSE", 8.9)
        };
        for (Student s : students) s.displayInfo();

        System.out.println("\n=== Faculty ===");
        Faculty[] faculty = {
            new Faculty(1, "Dr. Alan Turing",  "Professor",           "Theory of Computation"),
            new Faculty(2, "Dr. Grace Hopper", "Associate Professor", "VLSI Design")
        };
        for (Faculty f : faculty) f.displayInfo();

        System.out.println("\n=== Analytics ===");
        double[] cgpa = {9.2, 8.5, 8.9};
        double highest = cgpa[0];
        double lowest = cgpa[0];
        double total = 0;
        for (double c : cgpa) {
            highest = max(highest, c);
            lowest = min(lowest, c);
            total += c;
        }
        System.out.printf("Highest CGPA : %.1f%n", highest);
        System.out.printf("Lowest CGPA  : %.1f%n", lowest);
        System.out.printf("Average CGPA : %.2f%n", total / cgpa.length);
    }
}
