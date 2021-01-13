package com.toasty.budgeting;

import junit.framework.TestCase;

public class LedgerTest extends TestCase {

    public void testEmptyTransactions() {
        Ledger empty = new Ledger();
        assertEquals(0, empty.getTotalTransactions());
    }

    public void testAddTransaction() {
        Ledger ledge = new Ledger();
        ledge.addTransaction(new Money(100));
        assertEquals(1, ledge.getTotalTransactions());
        assertEquals(100, ledge.getTransaction(0).getAmount());
    }

    public void testGetTotal() {
        Ledger total = new Ledger();
        total.addTransaction(new Money(100));
        total.addTransaction(new Money(155));
        assertEquals(2, total.getTotalTransactions());
        assertEquals(255, total.getTotal().getAmount());
    }

    public void testLedgerPrinter() {
        Ledger mock = new Ledger();
        mock.addTransaction(new Money(165));
        mock.addTransaction(new Money(879));
        mock.addTransaction(new Money(100000));
        assertEquals("$1.65\n$8.79\n$1,000.00\n$1,010.44", LedgerPrinter.printLedger(mock));
    }
}
