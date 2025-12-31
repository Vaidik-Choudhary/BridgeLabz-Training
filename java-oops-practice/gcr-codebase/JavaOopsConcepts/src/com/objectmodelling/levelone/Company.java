package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Company {

    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    // main method inside Company class
    public static void main(String[] args) {

        Company company = new Company("TechSoft");

        Department d1 = new Department("IT");
        d1.addEmployee("Aman");
        d1.addEmployee("Neha");

        Department d2 = new Department("HR");
        d2.addEmployee("Riya");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyDetails();

        company = null;
    }
}

