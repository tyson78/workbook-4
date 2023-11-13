package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    //<---Global attributes--->
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;
    //  to store the dealership's inventory


    // <---To String--->
    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }

    // <---Constructor--->
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    // <---Getters and Setters--->
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    //<---list options methods--->
    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> output = new ArrayList<>();

        for (Vehicle v : inventory) {
            Double curPrice = v.getPrice();
            if (min <= curPrice && curPrice <= max) {
                output.add(v);
            }
        }
        return output;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> arrayListOfVehicles = new ArrayList<>();

        for (Vehicle v : inventory) {
            if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
                arrayListOfVehicles.add(v);
            }
        }
        return arrayListOfVehicles;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {

        List<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle v : inventory) {
            int curYear = v.getYear();
            if (min <= curYear && curYear <= max) {
                vehicles.add(v);
            }
        }
        return vehicles;
    }

    public List<Vehicle> getVehiclesByColor(String color) {

        List<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle v : inventory) {
            String curColor = v.getColor();
            if (curColor.equalsIgnoreCase(color)) {
                vehicles.add(v);
            }
        }
        return vehicles;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        List<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle v : inventory) {
            int curMileage = v.getOdometer();
            if (min <= curMileage && curMileage <= max) {
                vehicles.add(v);
            }
        }
        return vehicles;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        List<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle v : inventory) {
            String curVehicleType = v.getVehicleType();
            if (curVehicleType.equalsIgnoreCase(vehicleType)) {
                vehicles.add(v);
            }
        }
        return vehicles;
    }

    public Vehicle getVehicleByVIN(int vin) {
        Vehicle vehicle = null;

        for (Vehicle v : inventory) {
            if (vin == v.getVin()) {
                return v;
            }
        }
        return vehicle;
    }

    // <---Add & Remove Vehicle--->
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {

    }

}