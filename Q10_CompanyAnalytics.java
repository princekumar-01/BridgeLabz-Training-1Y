// com/company/analytics/sales/SalesReport.java
package com.company.analytics.sales;

public class SalesReport {
    public void printSalesReport() {
        System.out.println("--- Sales Report ---");
        System.out.println("North : $350,000");
        System.out.println("South : $280,000");
        System.out.println("East  : $420,000");
        System.out.println("West  : $310,000");
        System.out.println("Total : $1,360,000");
    }
}


// com/company/analytics/hr/EmployeeReport.java
package com.company.analytics.hr;

public class EmployeeReport {
    public void printEmployeeReport() {
        System.out.println("--- Employee Performance Report ---");
        System.out.println("Alice Chen    | Engineering | 4.8");
        System.out.println("Bob Martinez  | Sales       | 4.2");
        System.out.println("Carol White   | HR          | 4.6");
        System.out.println("David Lee     | Marketing   | 3.9");
    }
}


// CompanyMain.java
import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class CompanyMain {
    public static void main(String[] args) {
        SalesReport salesReport = new SalesReport();
        salesReport.printSalesReport();

        System.out.println();

        EmployeeReport employeeReport = new EmployeeReport();
        employeeReport.printEmployeeReport();
    }
}
