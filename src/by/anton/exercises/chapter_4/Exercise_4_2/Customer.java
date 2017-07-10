package by.anton.exercises.chapter_4.Exercise_4_2;

/**
 * Created by Buben_AV on 16.05.2017.
 */
public class Customer {
    private int id;
    private String firstName;
    private String secondName;
    //more code here

    public Customer(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
