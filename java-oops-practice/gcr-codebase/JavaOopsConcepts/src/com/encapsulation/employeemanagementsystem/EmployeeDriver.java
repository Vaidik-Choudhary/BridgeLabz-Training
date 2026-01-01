package com.encapsulation.employeemanagementsystem;

public class EmployeeDriver {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        FullTimeEmployee e1 =
            new FullTimeEmployee(101, "Rahul", 60000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2 =
            new PartTimeEmployee(102, "Amit", 80, 500);
        e2.assignDepartment("Support");

        employees[0] = e1;
        employees[1] = e2;

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
            System.out.println();
        }
    }
}

