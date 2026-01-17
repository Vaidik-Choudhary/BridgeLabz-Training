package com.generics.aidrivenresumescreeningsystem;

public class Resume<T extends JobRole> {

    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }
    
    public void process() {
        jobRole.evaluateSkills();
    }
}

