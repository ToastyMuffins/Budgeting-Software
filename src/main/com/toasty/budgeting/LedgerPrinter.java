package com.toasty.budgeting;

public class LedgerPrinter {
    public static String printLedger(Ledger ledger) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ledger.getTotalTransactions(); i++) {
            sb.append(ledger.getTransaction(i).getFormattedAmount())
                .append("\n");
        }
        sb.append(ledger.getTotal().getFormattedAmount());
        return sb.toString();
    }
}
