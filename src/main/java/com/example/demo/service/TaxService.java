package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaxService {
    private List<TaxSlab> taxSlabs;

    public TaxService() {
        taxSlabs = new ArrayList<>();
        taxSlabs.add(new TaxSlab(250000, 0));  // 0% for income up to 2,50,000
        taxSlabs.add(new TaxSlab(500000, 5));   // 5% for income 2,50,001 to 5,00,000
        taxSlabs.add(new TaxSlab(1000000, 20)); // 20% for income 5,00,001 to 10,00,000
        taxSlabs.add(new TaxSlab(Double.MAX_VALUE, 30)); // 30% for income above 10,00,000
    }

    public double calculateTax(double income) {
        double tax = 0;
        double previousSlabLimit = 0;

        for (TaxSlab slab : taxSlabs) {
            if (income > previousSlabLimit) {
                double taxableIncome = Math.min(income, slab.getIncome()) - previousSlabLimit;
                tax += taxableIncome * (slab.getTaxRate() / 100);
                previousSlabLimit = slab.getIncome();
            }
        }
        return tax;
    }
}
