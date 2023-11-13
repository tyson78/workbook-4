package com.pluralsight;

import java.time.LocalDate;

public abstract class Contract {
    private String contractDate;
    private String customerName;
    private String customerEmail;
    private Vehicle vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    //<---Constructors--->

    public Contract(String contractDate, String customerName, String customerEmail, Vehicle vehicleSold) {
        this.contractDate = contractDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

//    public Contract(String contractDate, String customerName, String customerEmail, Vehicle vehicleSold) {
//        this.contractDate = contractDate;
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.vehicleSold = vehicleSold;
//    }


    //<---Getters & Setters--->
    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    //<---Abstract methods--->
    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}

