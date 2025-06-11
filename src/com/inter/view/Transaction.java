package com.inter.view;
import java.time.LocalDate;

public class Transaction {
    private String id;
    private LocalDate date;
    private double amount;

    public Transaction(String id, LocalDate date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    // Getters and toString() if needed
}
