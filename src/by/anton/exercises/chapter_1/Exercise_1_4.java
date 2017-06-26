package by.anton.exercises.chapter_1;

import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */
/**
 * Exercise 4 of chapter 1
 */
public class Exercise_1_4 {
    private final String TASK = "#4 Ввести пароль из командной строки и сравнить его со строкой-образцом.";
    private String password;
    private final String PASSWORD = "da";

    public Exercise_1_4() {
        this.enterPassword();
        this.checkPassword();
    }

    public void enterPassword() {
        System.out.println("Enter password (da): ");
        Scanner scan = new Scanner(System.in);
        this.password = scan.next();
    }

    public void checkPassword() {
        if (this.password.equals(PASSWORD)) {
            System.out.println("Password is true: " + this.password + "!");
        } else {
            System.out.println("Password is false: " + this.password + "!");
        }
    }
}

