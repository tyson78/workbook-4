package com.pluralsight;

import java.io.*;

public class DealershipFileManager {
    public Dealership getDealership() {

        Dealership dealership = null;

        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("inventory.csv");
            bufferedReader = new BufferedReader(fileReader);
            String input;
            String firstLine;

            // first line
            firstLine = bufferedReader.readLine();
            String[] firstLineStrings = firstLine.split("\\|");
            var name = firstLineStrings[0].trim();
            var address = firstLineStrings[1].trim();
            var phone = firstLineStrings[2].trim();

            dealership = new Dealership(name, address, phone);

            while ((input = bufferedReader.readLine()) != null) {
                String[] fields = (input.toString()).split("\\|");

                var vin = Integer.parseInt(fields[0]);
                var year = Integer.parseInt(fields[1]);
                var make = fields[2].trim();
                var model = fields[3].trim();
                var vehicleType = fields[4].trim();
                var color = fields[5].trim();
                var odometer = Integer.parseInt(fields[6]);
                var price = Double.parseDouble(fields[7]);

                Vehicle v = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                dealership.addVehicle(v);
            }
            // todo remove this when we have testing in place
            System.out.println(dealership);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership) {

        // try w/ resources
        try (FileWriter fileWriter = new FileWriter("inventory.csv", false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
        {
            String output;

            bufferedWriter.append(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());

            for (Vehicle v : dealership.getAllVehicles()) {
                output = String.format("%d|%d|%s|%s|%s|%s|%d|%.2f", v.getVin(), v.getYear(), v.getMake(), v.getModel(),
                        v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
                bufferedWriter.append("\n" + output);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
