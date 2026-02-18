// com/company/hr/Employee.java
package com.company.hr;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void displayDetails() {
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.printf("Salary     : %.2f%n", salary);
    }
}


// com/company/payroll/Payroll.java
package com.company.payroll;

import com.company.hr.Employee;

public class Payroll {
    public double calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
        return bonus;
    }
}


// com/company/main/MainApp.java
package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Diana Prince", "Engineering", 60000.00);

        System.out.println("--- Before Bonus ---");
        emp.displayDetails();

        Payroll payroll = new Payroll();
        double bonus = payroll.calculateBonus(emp);

        System.out.println("\n--- After Bonus ---");
        emp.displayDetails();
        System.out.printf("Bonus Added: %.2f%n", bonus);
    }
}
