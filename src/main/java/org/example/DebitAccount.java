package org.example;

public class DebitAccount extends BankAccount{
    @Override
    protected void withdraw(double amount) {
        if(balance >= amount){
            System.out.println("Заберите деньги");
        } else{
            System.out.println("Недостаточно средств");
        }
    }
}
