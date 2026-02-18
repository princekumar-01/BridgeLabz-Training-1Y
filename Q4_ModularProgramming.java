// collegeinfo/module-info.java
module collegeinfo {
    exports college.student;
}


// collegeinfo/college/student/Student.java
package college.student;

public class Student {
    private String name;
    private int rollNumber;
    private String branch;

    public Student(String name, int rollNumber, String branch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
    }

    public void displayDetails() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNumber);
        System.out.println("Branch  : " + branch);
    }
}


// app/module-info.java
module app {
    requires collegeinfo;
}


// app/MainApp.java
import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Bob Martin", 201, "Computer Science");
        s.displayDetails();
    }
}
