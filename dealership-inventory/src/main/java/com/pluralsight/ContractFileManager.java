package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {

    public void saveContract(Contract contract) {

        // try w/ resources
        try (FileWriter fileWriter = new FileWriter("contracts.csv", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String output;

            if (contract instanceof SalesContract) {

                SalesContract salesContract = (SalesContract) contract;

                output = String.format("SALE|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%.2f|%.2f|%.2f|%.2f|%.2f|%s|%.2f",
                        salesContract.getContractDate(),
                        salesContract.getCustomerName(),
                        salesContract.getCustomerEmail(),
                        salesContract.getVehicleSold().getVin(),
                        salesContract.getVehicleSold().getYear(),
                        salesContract.getVehicleSold().getMake(),
                        salesContract.getVehicleSold().getModel(),
                        salesContract.getVehicleSold().getVehicleType(),
                        salesContract.getVehicleSold().getColor(),
                        salesContract.getVehicleSold().getOdometer(),
                        salesContract.getVehicleSold().getPrice(),
                        salesContract.getProcessingFee(),
                        salesContract.getSalesTaxAmount(),
                        salesContract.getRecordingFee(),
                        salesContract.getTotalPrice(),
                        salesContract.isFinance() ? "YES" : "NO",
                        salesContract.getMonthlyPayment()
                );
                bufferedWriter.append("\n" + output);

            } else if (contract instanceof LeaseContract) {

                LeaseContract leaseContract = (LeaseContract) contract;

                output = String.format("LEASE|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%.2f|%.2f|%.2f|%.2f|%.2f",
                        leaseContract.getContractDate(),
                        leaseContract.getCustomerName(),
                        leaseContract.getCustomerEmail(),
                        leaseContract.getVehicleSold().getVin(),
                        leaseContract.getVehicleSold().getYear(),
                        leaseContract.getVehicleSold().getMake(),
                        leaseContract.getVehicleSold().getModel(),
                        leaseContract.getVehicleSold().getVehicleType(),
                        leaseContract.getVehicleSold().getColor(),
                        leaseContract.getVehicleSold().getOdometer(),
                        leaseContract.getVehicleSold().getPrice(),
                        leaseContract.getExpectedEndingValue(),
                        leaseContract.getLeaseFee(),
                        leaseContract.getTotalPrice(),
                        leaseContract.getMonthlyPayment()
                );
                bufferedWriter.append("\n" + output);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
