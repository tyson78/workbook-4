package com.pluralsight;

public class SalesContract extends Contract {
    private static final double salesTaxRate = 0.05;
    private double salesTaxAmount;
    private static final double recordingFee = 100; // in dollars $
    private double processingFee;
    private boolean isFinance;

    public SalesContract(String contractDate, String customerName, String customerEmail,
                         Vehicle vehicleSold, boolean isFinance) {
        super(contractDate, customerName, customerEmail, vehicleSold);
        salesTaxAmount = vehicleSold.getPrice() * salesTaxRate;
        processingFee = vehicleSold.getPrice() < 10000 ? 295 : 495;
        this.isFinance = isFinance;
    }

    // <---totalPrice & monthly payment--->
    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        double vehiclePrice = getVehicleSold().getPrice();
        totalPrice = vehiclePrice + salesTaxAmount + recordingFee + processingFee;
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        double monthlyPayment = 0.00;

        if (isFinance == true) {
            double interestRate = 0;
            int loanTerms = 0;
            double vehiclePrice = getVehicleSold().getPrice();

            if (vehiclePrice >= 10000) {
                // Monthly payment = (Amount financed * Monthly interest rate) / (1 - (1 + Monthly interest rate)^-Number of months in lease term)
                interestRate = 0.0425;
                loanTerms = 48;
            }
            else {
                interestRate = 0.0525;
                loanTerms = 24;
            }

            double loanPrice = interestRate * this.getTotalPrice();
            double monthlyInterestRate = interestRate / 12 / 100;
            monthlyPayment = (loanPrice * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -loanTerms));

            return monthlyPayment;
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
