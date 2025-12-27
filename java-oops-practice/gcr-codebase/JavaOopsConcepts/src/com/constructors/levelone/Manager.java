package com.constructors.levelone;

public class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void show() {
        System.out.println(employeeID);
        System.out.println(department);
        System.out.println(getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(10, "HR", 50000);
        m.show();
    }
}

