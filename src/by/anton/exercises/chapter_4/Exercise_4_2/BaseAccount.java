package by.anton.exercises.chapter_4.Exercise_4_2;

/**
 * Created by Buben_AV on 16.05.2017.
 */
public abstract class BaseAccount {
    protected int accountNumber;
    protected boolean block;
    protected Customer customer;
    protected double amount;

    public abstract void setAmount(double amount);
    public abstract double getAmount();

    public BaseAccount(Customer customer, int idAccount) {
        this.customer = customer;
        this.accountNumber = idAccount;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
