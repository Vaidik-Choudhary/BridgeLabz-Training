package com.interfaces.staticmethods.unitconversiontool;

public class UnitConversionMain {

    private static void convertUnits() {

        double distance = 10;
        double weight = 5;

        System.out.println(distance + " KM = " + UnitConverter.kmToMiles(distance) + " Miles");

        System.out.println(weight + " KG = " + UnitConverter.kgToPounds(weight) + " Pounds");
    }

    public static void main(String[] args) {
        convertUnits();
    }
}

