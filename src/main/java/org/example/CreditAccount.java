package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditAccount extends BankAccount implements TransactionFee{
    private double creditLimit = 5000.00;
    @Override
    protected void withdraw(double amount) {
        double fee = applyFee(amount);
        if((balance + creditLimit + fee) >= amount){
            balance -= fee - amount;
            System.out.println("Заберите деньги");
        } else{
            System.out.println("Недостаточно средств");
        }
    }


    @Override
    public double applyFee(double amount) {
        return amount * 0.1;
    }
}
