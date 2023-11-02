package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {
    Dealership d = new Dealership("Paul", "222 Old Road", "607-272-4311");

    // @org.junit.jupiter.api.Test
    @Test
    void addVehicle_changesInventory() {
        Vehicle v = new Vehicle(12345, 1992, "Honda", "Civic", "sedan", "black", 25090, 1500.);

        // assertEquals(0, d.getInventory().size());
        d.addVehicle(v);
        // assertEquals(1, d.getInventory().size());
    }

    @Test
    void addVehicle_addsSpecificVehicleInList() {
        Vehicle v = new Vehicle(10112, 1993, "Ford", "Explorer", "SUV", "Red", 525123, 995.0);
        d.addVehicle(v);
        assertEquals(true, d.getAllVehicles().contains(v));
    }

    @Test
    void getVehiclesByMakeModel() {
        Vehicle v = new Vehicle(12345, 2003, "Ford", "Explorer", "Truck", "Purple", 25, 27000.0);
        d.addVehicle(v);

        // Fail example
        // assertTrue(d.getVehiclesByMakeModel("Ford", "Limited").contains(v));

        // Pass example
        assertTrue(d.getVehiclesByMakeModel("Ford", "Explorer").contains(v));

    }
}