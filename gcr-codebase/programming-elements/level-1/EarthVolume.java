// Creating EarthVolume class to compute volume of earth
class EarthVolume {
    public static void main(String[] args) {

        // Creating variable and Calculations
        double radiusKm = 6378;
        double kmToMiles = 1.6;
        double radiusMiles = radiusKm / kmToMiles;
        double volumeKm3 = (4.0 / 3) * Math.PI * radiusKm * radiusKm * radiusKm;
        double volumeMiles3 = (4.0 / 3) * Math.PI * radiusMiles * radiusMiles * radiusMiles;

        // Printing volume of earth in cubic kilometers and cubic miles
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}