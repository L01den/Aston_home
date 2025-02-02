package org.example;

public abstract class BankAccount {
    protected long accountNumber;
    protected double balance;
    protected Person accountHolder;

    public BankAccount(long accountNumber, double balance, Person accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    protected abstract boolean withdraw(double amount);
    protected void deposit(double amount){
        balance += amount;
        System.out.println("Баланс пополнен");
    }
}
