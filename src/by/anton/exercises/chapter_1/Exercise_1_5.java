package by.anton.exercises.chapter_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */
/**
 * Exercise 5 of chapter 1
 */
public class Exercise_1_5 {
    private final String TASK = "#5 Ввести целые числа как аргументы командной строки, подсчитать их сум мы (произведения) и вывести результат на консоль.";
    private int[] numbers;

    public Exercise_1_5() {
        this.setArguments();
        this.getArguments();
    }

    public void setArguments() {
        System.out.println("Enter n: ");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        numbers = new int[scan.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
    }

    public void getArguments() {
        System.out.println("Numbers "+numbers.length);
        int sum =0;
        double mpl = 1.0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
            mpl *= numbers[i];
        }
        System.out.println("\nSum : "+sum);
        System.out.println("Multiplication : "+mpl);
    }

}
