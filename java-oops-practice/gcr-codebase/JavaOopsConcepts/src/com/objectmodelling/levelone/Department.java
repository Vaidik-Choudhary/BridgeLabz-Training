package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Department {

    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println("Employee: " + e.empName);
        }
    }
}

