package com.toasty.budgeting;

import java.text.NumberFormat;

public class Money {

    private final int pennies;

    Money(int pennies) {
        this.pennies = pennies;
    }

    public int getAmount() {
        return pennies;
    }

    public Money add(Money moneyToAdd) {
        return new Money(pennies + moneyToAdd.getAmount());
    }

    public Money subtract(Money moneyToSubtract) {
        return new Money(pennies - moneyToSubtract.getAmount());
    }

    public String getFormattedAmount() {
        return NumberFormat.getCurrencyInstance().format((double) pennies / 100);
    }

}
