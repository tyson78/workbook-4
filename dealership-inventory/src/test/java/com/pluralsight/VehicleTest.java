package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void constructorTest() {
        System.out.println("We are testing here!");
        Vehicle v = new Vehicle(1, 1993, "Honda", "Accord", "sedan", "purple", 270000, 85.00);
    }

    @Test
    public void constructorTest_allValues() {
        System.out.println("We are testing here!");
        Vehicle v = new Vehicle(1, 1993, "Honda", "Accord", "sedan", "purple", 270000, 85.00);
        assertEquals(1, v.getVin());
        assertEquals(1993, v.getYear());
        assertEquals("Honda", v.getMake());
    }

    @Test
    public void constructorTest_colorSetProperly_inAnyYearExcept1993And1992() {
        Vehicle v = new Vehicle(1, 1992, "Honda", "Accord", "sedan", "purple", 270000, 85.00);
        if (v.getYear() == 1992) assertEquals("Green", v.getColor(), "Color not right");
        if (v.getYear() == 1993) assertEquals("silver", v.getColor(), "Color not right");
    }

    @Test
    public void constructorTest_colorSetProperly_in1993allCarsAreSilver() {
        Vehicle v = new Vehicle(1, 1993, "Honda", "Accord", "sedan", "purple", 270000, 85.00);
        assertEquals("silver", v.getColor(), "Color not right");
    }

}