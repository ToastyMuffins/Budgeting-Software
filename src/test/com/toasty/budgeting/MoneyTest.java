package com.toasty.budgeting;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

    public void testZeroMoney() {
        Money zero = new Money(0);
        assertMoney(0, zero);
    }

    private void assertMoney(int expected, Money money) {
        assertEquals(expected, money.getAmount());
    }

    private void assertFormattedMoney(String expected, Money money){
        assertEquals(expected, money.getFormattedAmount());
    }

    public void testImmutability() {
        Money first = new Money(100);
        Money second = new Money(50);

        Money sum = first.add(second);

        assertMoney(100, first);
        assertMoney(50, second);
        assertMoney(150, sum);
    }

    public void testCents() {
        Money cents = new Money(5);
        assertMoney(5, cents);
    }

    public void testAddMoney() {
        Money addOne = new Money(100);
        Money addTwo = new Money(55);
        Money total = addOne.add(addTwo);
        assertMoney(155, total);
    }

    public void testAddNegativeMoney() {
        Money nAdd = new Money(100);
        Money nAddTwo = new Money(-55);
        Money total = nAdd.add(nAddTwo);
        assertMoney(45, total);
    }

    public void testSubtractMoney() {
        Money sub = new Money(100);
        Money subTwo = new Money(55);
        Money total = sub.subtract(subTwo);
        assertMoney(45, total);
    }

    public void testSubtractNegativeMoney() {
        Money nSub = new Money(100);
        Money nSubTwo = new Money(-55);
        Money total = nSub.subtract(nSubTwo);
        assertMoney(155, total);
    }

    public void testZeroFormatted() {
        Money zFormat = new Money(0);
        assertFormattedMoney("$0.00", zFormat);
    }

    public void testGetFormattedAmount() {
        Money money = new Money(100);
        assertFormattedMoney("$1.00", money);
    }

    public void testGetNegativeFormattedAmount() {
        Money nFormat = new Money(-155);
        assertFormattedMoney("-$1.55", nFormat);
    }
}
