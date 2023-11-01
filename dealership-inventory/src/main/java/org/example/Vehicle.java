package org.example;

public class Vehicle {
    private int year;
    private int vin;
    private int odometer;
    private String make;
    private String model;
    private String color;
    private String vehicleType;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color,  int odometer, double price) {
        this.year = year;
        this.vin = vin;
        this.odometer = odometer;
        this.make = make;
        this.model = model;
        this.color = color;
        this.vehicleType = vehicleType;
        this.price = price;
    }

    //Getters and Setters
    public int Getyear() {
        return year;
    }

    public int Getvin() {
        return vin;
    }

    public int Getodometer() {
        return odometer;
    }

    public String Getmake() {
        return make;
    }

    public String Getmodel() {
        return model;
    }

    public String Getcolor() {
        return color;
    }

    public String GetvehicleType() {
        return vehicleType;
    }

    public double Getprice() {
        return price;
    }

    public void Setyear(int year) {
        this.year = year;
    }

    public void Setvin(int vin) {
        this.vin = vin;
    }

    public void Setmake(String make) {
        this.make = make;
    }

    public void Setmodel(String model) {
        this.model = model;
    }

    public void Setcolor(String color) {
        this.color = color;
    }

    public void SetvehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void Setprice(double price) {
        this.price = price;

    }
}
