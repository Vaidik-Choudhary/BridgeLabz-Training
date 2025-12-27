package com.constructors.levelone;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void show() {
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(getCgpa());
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent(21, "Samuel", 8.2);
        p.show();
    }
}
