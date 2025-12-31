package com.objectmodelling.levelone;

public class Hospital {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Agarwal");
        Doctor d2 = new Doctor("Singh");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Anita");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}

