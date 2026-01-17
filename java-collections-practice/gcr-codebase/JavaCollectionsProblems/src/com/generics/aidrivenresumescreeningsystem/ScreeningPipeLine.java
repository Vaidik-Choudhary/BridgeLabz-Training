package com.generics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ScreeningPipeLine {

    private List<Resume<? extends JobRole>> pipeline;

    public ScreeningPipeLine() {
        pipeline = new ArrayList<>();
    }

    public void addResume(Resume<? extends JobRole> resume) {
        pipeline.add(resume);
    }

    public void screenAll() {
        for (Resume<? extends JobRole> resume : pipeline) {
            resume.process();
        }
    }
}

