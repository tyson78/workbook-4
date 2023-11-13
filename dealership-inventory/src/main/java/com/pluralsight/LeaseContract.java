package com.pluralsight;

public class LeaseContract extends Contract {
    private double expectedEndingValue = 0.50 * this.getVehicleSold().getPrice();
    private double leaseFee = 0.07 * this.getVehicleSold().getPrice();

    public LeaseContract(String contractDate, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(contractDate, customerName, customerEmail, vehicleSold);
    }

    // <---Getters & Setters--->
    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }
    public double getLeaseFee() {
        return leaseFee;
    }

    // <---Get total price & monthly payment methods--->
    @Override
    public double getTotalPrice() {
        return this.getVehicleSold().getPrice() + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        double interestRate = 0.04;
        int loanTermMonths = 36;

        double loanAmount = getTotalPrice();
        double monthlyInterestRate = interestRate / 12 / 100;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        return monthlyPayment * 3;
    }
}
