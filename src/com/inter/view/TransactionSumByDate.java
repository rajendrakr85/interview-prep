package com.inter.view;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TransactionSumByDate {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
            new Transaction("T1", LocalDate.of(2024, 6, 1), 100.0),
            new Transaction("T2", LocalDate.of(2024, 6, 1), 150.0),
            new Transaction("T3", LocalDate.of(2024, 6, 2), 200.0),
            new Transaction("T4", LocalDate.of(2024, 6, 3), 50.0),
            new Transaction("T5", LocalDate.of(2024, 6, 2), 300.0)
        );

        Map<LocalDate, Double> dailyTotals = transactions.stream()
            .collect(Collectors.groupingBy(
                Transaction::getDate,
                Collectors.summingDouble(Transaction::getAmount)
            ));

        // Print the result
        dailyTotals.forEach((date, total) ->
            System.out.println(date + " -> " + total)
        );
    }
}
