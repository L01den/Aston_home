package org.example;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount implements InterestBearing{
    @Override
    protected void withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Заберите деньги");
        } else{
            System.out.println("Недостаточно средств");
        }
    }

    @Override
    public void applyInterest() {
        int day = LocalDate.now().getDayOfMonth();

        if(day == 1){
            balance *= 0.1;
        }
    }
}
