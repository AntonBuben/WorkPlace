package by.anton.exercises.chapter_4.Exercise_4_2;

/**
 * Created by Buben_AV on 16.05.2017.
 */
public abstract class BaseAccount {
    private int accountNumber;
    private boolean block;
    private Customer customer;
    private int amount;

    public abstract void setAmount(int amount);
    public abstract int getAmount();

    public BaseAccount(Customer customer) {
        this.customer = customer;
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
