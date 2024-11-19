package com.example.demo.service;

public class TaxSlab {
    private double income;
    private double taxRate;

    public TaxSlab(double income, double taxRate) {
        this.income = income;
        this.taxRate = taxRate;
    }

    public double getIncome() {
        return income;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
