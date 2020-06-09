package Task4;

import java.math.BigDecimal;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double money){
        balance +=money;
        System.out.println("Вы положили на счет:" + Math.ceil(money) + "$");
    }
    public void debit(double money) {
        if(money > balance){
            System.out.println("Сумма снятия больше чем остаок на счету!");
        }else {
            balance -= money;
            System.out.println("Вы сняли со счета:" + Math.ceil(money) + "$" );
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber:" + accountNumber + "balance:" + balance +
                '}';
    }
}
