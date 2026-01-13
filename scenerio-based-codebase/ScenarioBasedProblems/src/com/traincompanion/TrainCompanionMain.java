package com.traincompanion;

public class TrainCompanionMain {

    public static void main(String[] args) {

        Train train = new Train();

        train.addCompartment("S1", true, false);
        train.addCompartment("S2", false, false);
        train.addCompartment("Pantry", false, true);
        train.addCompartment("S3", true, false);

        train.traverseForward();
        train.traverseBackward();

        System.out.println("\nAdjacent compartments of Pantry:");
        train.showAdjacent("Pantry");

        train.removeCompartment("S2");

        train.traverseForward();
    }
}

