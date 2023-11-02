package com.pluralsight;

public class Vehicle {
    private int year;
    private int vin;
    private String make;
    private String model;
    private String color;
    private String vehicleType;

    private int odometer;
    private double price;

    // Constructor
    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color,  int odometer, double price) {
        this.year = year;
        this.vin = vin;
        this.odometer = odometer;
        this.make = make;
        this.model = model;
        this.color = color;
        this.vehicleType = vehicleType;
        this.price = price;

        if (year == 1993) this.color = "silver";
        if (year == 1992) this.color = "Green";
    }

    // To String
    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", vin=" + vin +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", odometer=" + odometer +
                ", price=" + price +
                '}';
    }

    // Getters and Setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
