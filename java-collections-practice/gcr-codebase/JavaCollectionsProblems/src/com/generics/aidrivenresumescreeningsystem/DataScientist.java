package com.generics.aidrivenresumescreeningsystem;

public class DataScientist extends JobRole {

    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluateSkills() {
        System.out.println(candidateName + " evaluated for statistics and machine learning skills.");
    }
}

