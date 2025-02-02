package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditAccount extends BankAccount implements TransactionFee{
    private double creditLimit = 5000.00;

    public CreditAccount(long accountNumber, double balance, Person accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    @Override
    protected boolean withdraw(double amount) {
        double fee = applyFee(amount);
        if(balance + creditLimit >= amount + fee){
            balance = fee - amount - balance;
            System.out.println("Заберите деньги");
            return true;
        } else{
            System.out.println("Недостаточно средств");
            return false;
        }
    }




    @Override
    public double applyFee(double amount) {
        return amount * 0.1;
    }
}
