package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TransactionProcessorTest {

    @Test
    public void processTransactionTrue() {
        BankAccount credit = new CreditAccount(1l, 4000, new Person("Oleg", "Petrov"));
        BankAccount debit = new DebitAccount(2l, 2000, new Person("Ivan", "Ivanov"));
        BankAccount saving = new SavingsAccount(3l, 8000, new Person("Sergei", "Sidorov"));

        List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(credit, debit, saving));
        TransactionProcessor transactionProcessor = new TransactionProcessor();

        Assert.assertTrue(transactionProcessor.processTransaction(bankAccounts, 1000));
    }

    @Test
    public void processTransactionFalse() {
        BankAccount credit = new CreditAccount(1l, 4000, new Person("Oleg", "Petrov"));
        BankAccount debit = new DebitAccount(2l, 2000, new Person("Ivan", "Ivanov"));
        BankAccount saving = new SavingsAccount(3l, 8000, new Person("Sergei", "Sidorov"));

        List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(credit, debit, saving));
        TransactionProcessor transactionProcessor = new TransactionProcessor();

        Assert.assertFalse(transactionProcessor.processTransaction(bankAccounts, 9000));
    }
}