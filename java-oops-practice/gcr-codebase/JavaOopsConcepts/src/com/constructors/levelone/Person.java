package com.constructors.levelone;

public class Person {

    String name;
    int age;
    
    public Person() {
        name = " ";
        age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person previous) {
        name = previous.name;
        age = previous.age;
    }  
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Samuel", 22);
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}

