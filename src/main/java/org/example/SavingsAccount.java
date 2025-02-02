package org.example;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount implements InterestBearing{
    public SavingsAccount(long accountNumber, double balance, Person accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    @Override
    protected boolean withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Заберите деньги");
            return true;
        } else{
            System.out.println("Недостаточно средств");
            return false;
        }
    }

    @Override
    public void applyInterest() {
            balance *= 0.1;
    }
}
