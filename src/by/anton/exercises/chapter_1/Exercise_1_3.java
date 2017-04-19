package by.anton.exercises.chapter_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_1_3 {
    private int number;

    public Exercise_1_3() {
        this.setName();
        this.getName();
    }

    public void setName() {
        System.out.println("Enter n: ");
        Scanner scan = new Scanner(System.in);
        this.number = scan.nextInt();
    }

    public void getName() {
        Random random = new Random();
        System.out.println("Random "+this.number);
        for (int i = 0; i < this.number; i++) {
            System.out.print(random.nextInt(10) + " ");
        }
    }
}

