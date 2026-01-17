package com.generics.aidrivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluateSkills() {
        System.out.println(candidateName + " evaluated for coding and system design skills.");
    }
}

