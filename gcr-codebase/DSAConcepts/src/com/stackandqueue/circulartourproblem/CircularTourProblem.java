 package com.stackandqueue.circulartourproblem;

public class CircularTourProblem {

    static int findStartingPump(int[] petrol, int[] distance) {

        int totalPetrolSurplus = 0;
        int currentPetrolSurplus = 0;
        int startPumpIndex = 0;

        for (int currentPump = 0; currentPump < petrol.length; currentPump++) {

            int surplus = petrol[currentPump] - distance[currentPump];

            totalPetrolSurplus += surplus;
            currentPetrolSurplus += surplus;
            
            if (currentPetrolSurplus < 0) {
                startPumpIndex = currentPump + 1;
                currentPetrolSurplus = 0;
            }
        }

        return totalPetrolSurplus >= 0 ? startPumpIndex : -1;
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println(findStartingPump(petrol, distance));
    }
}
