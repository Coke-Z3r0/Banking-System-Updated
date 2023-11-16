/**
 * Name: Premium Account.Java
 * Author:Lee McGuire Faud
 * Date: 11/2/2023
 * Description: this is the class that allows the overdraft limit on the premium account, and does not
 * conflict with the basic account.
 */
public class PremiumAccount extends Account {
    private double overdraftLimit;//calling the over

    public PremiumAccount(Customer customer, int accountNumber, double overdraftLimit) {
        super(customer, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

