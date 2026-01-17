package com.generics.aidrivenresumescreeningsystem;

public class ProductManager extends JobRole {

    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluateSkills() {
        System.out.println(candidateName + " evaluated for leadership and communication skills.");
    }
}

