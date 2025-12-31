package com.objectmodelling.levelone;

import java.util.ArrayList;

public class University {

    String uniName;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public static void main(String[] args) {

        University u = new University("Global University");

        Department d1 = new Department("CSE");
        Department d2 = new Department("ECE");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        u.addDepartment(d1);
        u.addDepartment(d2);

        u.addFaculty(f1);
        u.addFaculty(f2);

        u = null;
    }
}
