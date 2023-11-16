/**
 * Name: Account.Java
 * Author:Lee McGuire Faud
 * Date: 11/2/2023
 * Description: This is the Class that is  considered universal for both the basic and premium account, as they both have
 * a balance, an account number and the ability to withdraw and deposit
 */
public abstract class Account {
    protected static double balance;//declaring protected variable for the Balance in all accounts
    private int accountNumber;
    private Customer customer;


    public Account(Customer customer, int accountNumber) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
