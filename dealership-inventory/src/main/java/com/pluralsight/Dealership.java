package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;
    //  to store the dealership's inventory


    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }

    // Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    // Getters and Setters
    // add a Vehicle to the dealership's inventory.
    // returns a list of all vehicles in the dealership's inventory.
    // searching vehicles


    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    // implement the search vehicle attributes like model, yeat ect

    public List<Vehicle> getVehiclesByPrice(double min, double max) {

        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {

        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {

        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {

        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {

        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public void removeVehicle(Vehicle vehicle) {

    }

}