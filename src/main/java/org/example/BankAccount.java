package org.example;

public abstract class BankAccount {
    protected long accountNumber;
    protected double balance;
    protected Person accountHolder;

    protected abstract void withdraw(double amount);
    protected void deposit(double amount){
        balance += amount;
        System.out.println("Баланс пополнен");
    }
}
