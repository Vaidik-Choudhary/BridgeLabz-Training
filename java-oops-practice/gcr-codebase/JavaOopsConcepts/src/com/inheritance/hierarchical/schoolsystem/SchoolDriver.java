package com.inheritance.hierarchical.schoolsystem;

public class SchoolDriver {
    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Maths");
        Person p2 = new Student("Riya", 16, 10);
        Person p3 = new Staff("Suresh", 35, "Accounts");

        ((Teacher) p1).displayRole();
        ((Student) p2).displayRole();
        ((Staff) p3).displayRole();
    }
}

