package by.anton.exercises.chapter_1;

import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_1_1 {
    private String name;

    public Exercise_1_1() {
        this.setName();
        this.getName();
    }

    public void setName() {
        System.out.println("Enter name: ");
        Scanner scan = new Scanner(System.in);
        this.name = scan.next();
    }

    public void getName() {
        System.out.println("Hello "+this.name+"!");
    }
}
