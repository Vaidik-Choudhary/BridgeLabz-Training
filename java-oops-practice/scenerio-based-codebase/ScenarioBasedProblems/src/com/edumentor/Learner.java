package com.edumentor;

public class Learner extends User implements ICertifiable {

    private String courseType; // short or full-time

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Short Course Certificate Generated for " + name);
        } else {
            System.out.println("Full-Time Professional Certificate Generated for " + name);
        }
    }
}
