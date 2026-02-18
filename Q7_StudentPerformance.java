// com/school/data/Student.java
package com.school.data;

public class Student {
    private String name;
    private double marks1;
    private double marks2;
    private double marks3;

    public Student(String name, double marks1, double marks2, double marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public String getName() { return name; }
    public double getMarks1() { return marks1; }
    public double getMarks2() { return marks2; }
    public double getMarks3() { return marks3; }

    public String toString() {
        return "Name: " + name + " | Sub1: " + marks1 + " | Sub2: " + marks2 + " | Sub3: " + marks3;
    }
}


// com/school/util/Analyzer.java
package com.school.util;

import com.school.data.Student;

public class Analyzer {
    public double calculateAverage(Student s) {
        return (s.getMarks1() + s.getMarks2() + s.getMarks3()) / 3.0;
    }

    public String findGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }
}


// com/school/main/PerformanceMain.java
package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class PerformanceMain {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Emma Watson",   85, 90, 78),
            new Student("Liam Neeson",   55, 62, 70),
            new Student("Olivia Taylor", 95, 98, 92)
        };

        Analyzer analyzer = new Analyzer();

        for (Student s : students) {
            System.out.println(s.toString());
            double avg = analyzer.calculateAverage(s);
            String grade = analyzer.findGrade(avg);
            System.out.printf("Average: %.2f  Grade: %s%n%n", avg, grade);
        }
    }
}
