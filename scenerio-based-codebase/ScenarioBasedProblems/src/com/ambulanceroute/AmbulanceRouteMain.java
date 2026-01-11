package com.ambulanceroute;

public class AmbulanceRouteMain {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        route.displayRoute();
        route.rotate(2);

        route.removeUnit("Radiology");
        route.displayRoute();
    }
}

