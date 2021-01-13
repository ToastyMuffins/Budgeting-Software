package com.toasty.budgeting;

import java.util.ArrayList;
import java.util.List;

public class Ledger {
    private final ArrayList<Money> transactions = new ArrayList<>();

    public void addTransaction(Money transaction) {
        transactions.add(transaction);
    }

    public int getTotalTransactions() {
        return transactions.size();
    }

    public Money getTransaction(int index) {
        return transactions.get(index);
    }

    public Money getTotal() {
        Money total = new Money(0);
        for (Money transaction : transactions) {
            total = total.add(transaction);
        }
        return total;
    }

    public String getFormattedTotal() {
        return getTotal().getFormattedAmount();
    }

    public List<Money> getAllTransactions() {
        return transactions;
    }

}
