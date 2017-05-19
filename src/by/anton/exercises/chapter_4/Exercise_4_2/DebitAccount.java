package by.anton.exercises.chapter_4.Exercise_4_2;

/**
 * Created by Buben_AV on 16.05.2017.
 */
public class DebitAccount extends BaseAccount {
    public DebitAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void setAmount(int amount) {

    }

    @Override
    public int getAmount() {
        return 0;
    }
}
