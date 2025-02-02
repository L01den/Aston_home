package org.example;

public class DebitAccount extends BankAccount implements TransactionValidator{
    public DebitAccount(long accountNumber, double balance, Person accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    @Override
    protected boolean withdraw(double amount) {
        if(validate(amount)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Заберите деньги");
                return true;
            } else {
                System.out.println("Недостаточно средств");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean validate(double amount) {
        if(amount < 10000) return true;
        return false;
    }
}
