/**
 * Name: Basic Account.Java
 * Author:Lee McGuire Faud
 * Date: 11/2/2023
 * Description: This is the class that sets up the depositing and withdrawals of Basic accounts, and will
 * not allow a withdrawal limit, unlike the premium account.
 */
public class BasicAccount extends Account {
    public BasicAccount(Customer customer, int accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
