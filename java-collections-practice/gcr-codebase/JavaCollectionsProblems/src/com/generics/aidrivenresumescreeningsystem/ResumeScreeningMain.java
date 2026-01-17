package com.generics.aidrivenresumescreeningsystem;

public class ResumeScreeningMain {

    public static void main(String[] args) {

        ScreeningPipeLine pipeline = new ScreeningPipeLine();

        Resume<SoftwareEngineer> seResume =
                new Resume<>(new SoftwareEngineer("Amit"));

        Resume<DataScientist> dsResume =
                new Resume<>(new DataScientist("Neha"));

        Resume<ProductManager> pmResume =
                new Resume<>(new ProductManager("Ravi"));

        pipeline.addResume(seResume);
        pipeline.addResume(dsResume);
        pipeline.addResume(pmResume);

        System.out.println("=== AI Resume Screening Started ===\n");
        pipeline.screenAll();
    }
    
    public static <T extends JobRole>
    void evaluateResume(Resume<T> resume) {
        resume.process();
    }
}

