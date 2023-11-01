package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    public Dealership getDealership() {

        try {
            FileReader fileReader = new FileReader("transactions.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;

            bufferedReader.readLine();

            while ((input = bufferedReader.readLine()) != null) {
                String[] fields = (input.toString()).split("\\|");
                // each String is {"date", "time", "description", "vendor", "amount"};

                var vin = Integer.parseInt(fields[0]);
                var year = Integer.parseInt(fields[1]);
                var make = fields[2].trim();
                var model = fields[3].trim();
                var vehicleType = fields[4].trim();
                var color = fields[5].trim();
                var odometer = Integer.parseInt(fields[6]);
                var price = Double.parseDouble(fields[7]);

                Vehicle v = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                // Dealership d;
                // d.add(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership) {

    }

}
