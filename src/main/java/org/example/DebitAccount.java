package org.example;

public class DebitAccount extends BankAccount{
    public DebitAccount(long accountNumber, double balance, Person accountHolder) {
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
}
