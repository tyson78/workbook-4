package com.pluralsight;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Dealership dealership;

    // <---Constructor--->
    public UserInterface() {
    }

    private void init() {
        DealershipFileManager dfm = new DealershipFileManager();
        this.dealership = dfm.getDealership();
    }

    public void display() {
        init();
        displayMenu();
    }

    // <---displayMenu() helper method--->
    public void displayMenu() {
        boolean done = false;

        // 1) display the menu
        while (!done) {
            System.out.println("""
                    Make A Choice:
                        1. Vehicle By Price
                        2. Vehicle By Make Model
                        3. Vehicle By Year
                        4. Vehicle By Color
                        5. Vehicle By Mileage
                        6. Vehicle By Type
                        7. All Vehicles
                        8. Add Vehicle
                        9. Remove Vehicle
                        0. Exit
                    """);

            // 2) read the user's command
            int input = scanner.nextInt();
            scanner.nextLine();

            // 3) switch statement that calls the correct process() method
            // that matches the user request.
            switch (input) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                case 0:
                    done = true;
                    break;
                default:
                    System.out.println("Please enter a correct number between 0 - 10: ");
            }
        }
    }

    // <---displayVehicles() helper method--->
    private void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("Displaying all the vehicles");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVin() + "|" + vehicle.getYear() + "|" +
                    vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" +
                    vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice()
            );
        }
        scanner.nextLine();
    }

    // <---Process Methods--->
    private void processGetByPriceRequest() {

    }

    private void processGetByMakeModelRequest() {
        // enter Make
        System.out.println("Please enter the Make");
        String make = scanner.nextLine();

        // enter Model
        System.out.println("Please enter the Model");
        String model = scanner.nextLine();

        // get Vehicle from Dealership
        List<Vehicle> vehicles = dealership.getVehiclesByMakeModel(make, model);

        // loop through return vehicles
        // print out each vehicles
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

    }

    private void processGetByYearRequest() {
    }

    private void processGetByColorRequest() {
    }

    private void processGetByMileageRequest() {
    }

    private void processGetByVehicleTypeRequest() {
    }

    private void processGetAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }

    private void processAddVehicleRequest() {
    }

    private void processRemoveVehicleRequest() {
    }

}
