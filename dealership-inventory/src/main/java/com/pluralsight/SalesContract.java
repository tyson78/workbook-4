package com.pluralsight;

import java.time.LocalDate;

public class SalesContract extends Contract {
    private static final double salesTaxRate = 0.05;
    private double salesTaxAmount;
    private static final double recordingFee = 100; // in dollars $
    private double processingFee;
    private boolean isFinance;

    public SalesContract(LocalDate contractDate, String customerName, String customerEmail,
                         Vehicle vehicleSold, double totalPrice, double monthlyPayment,
                         boolean isFinance) {
        super(contractDate, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.isFinance = isFinance;
        salesTaxAmount = vehicleSold.getPrice() * salesTaxRate;
        processingFee = vehicleSold.getPrice() < 10000 ? 295 : 495;
    }

    // <---totalPrice & monthly payment--->
    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        double vehiclePrice = getVehicleSold().getPrice();
        double totalTax = vehiclePrice * salesTaxAmount;
        totalPrice = vehiclePrice + totalTax + recordingFee + processingFee;
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        double monthlyPayment;
        double interestRate = 0;
        int paymentPerUnit = 0;
        int loanTermsInYears = 0;

        double vehiclePrice = getVehicleSold().getPrice();

        if (vehiclePrice > 10000) {
            // Monthly payment = (Amount financed * Monthly interest rate) / (1 - (1 + Monthly interest rate)^-Number of months in lease term)
            interestRate = 0.0425;
            paymentPerUnit = 48;
            loanTermsInYears = 2;

            double top = vehiclePrice * (interestRate/paymentPerUnit);
            double bottom = 1 - (1+Math.pow((interestRate/paymentPerUnit), -(loanTermsInYears * paymentPerUnit)));
            monthlyPayment = top/bottom;

        } else {
            interestRate = 0.0525;
            paymentPerUnit = 24;
            loanTermsInYears = 1;

            double top = vehiclePrice * (interestRate);
            double bottom = 1 - (1+Math.pow(interestRate, -paymentPerUnit));
            monthlyPayment = top/bottom;
        }
        return monthlyPayment;
    }

    //<---Getters & Setters--->
    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return isFinance;
    }

    public void setFinance(boolean finance) {
        isFinance = finance;
    }
}
