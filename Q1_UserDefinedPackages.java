// college/student/Student.java
package college.student;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayRollNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
}


// college/faculty/Faculty.java
package college.faculty;

public class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayName() {
        System.out.println("Faculty Name: " + name);
    }

    public void displaySubject() {
        System.out.println("Subject: " + subject);
    }
}


// MainApp.java (default package)
import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Alice Johnson", 101);
        s.displayName();
        s.displayRollNumber();

        System.out.println();

        Faculty f = new Faculty("Dr. Robert Smith", "Data Structures");
        f.displayName();
        f.displaySubject();
    }
}
