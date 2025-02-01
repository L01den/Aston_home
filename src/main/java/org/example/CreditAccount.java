package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditAccount extends BankAccount{
    private double creditLimit = 5000.00;
    @Override
    protected void withdraw(double amount) {
        if(balance + creditLimit >= amount){
            System.out.println("Заберите деньги");
        } else{
            System.out.println("Недостаточно средств");
        }
    }


}
