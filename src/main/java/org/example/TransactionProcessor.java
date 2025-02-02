package org.example;

import java.util.List;

public class TransactionProcessor {
    public boolean processTransaction(List<BankAccount> accounts, double amount){
        for (BankAccount account: accounts){
            if (!account.withdraw(amount)) return false;
        }
        return true;
    }
}
