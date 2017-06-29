package by.anton.exercises.chapter_4.Exercise_4_2;

/**
 * Created by Buben_AV on 16.05.2017.
 */
public class CreditAccount extends BaseAccount {
    public CreditAccount(Customer customer, int idAccount) {
        super(customer, idAccount);
    }

    @Override
    public void setAmount(double amount) {
        if (amount < 0) {
            this.amount = amount;
        } else
            System.out.println("Incorrect amount");
    }

    @Override
    public double getAmount() {
        return this.amount;
    }
}
