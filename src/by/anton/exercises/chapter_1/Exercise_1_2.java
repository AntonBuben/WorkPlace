package by.anton.exercises.chapter_1;

import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */

/**
 * Exercise 2 of chapter 1
 */
public class Exercise_1_2 {
    private final String TASK = "#2 Отобразить в окне консоли аргументы командной строки в обратном порядке.";
    private String arguments;

    public Exercise_1_2() {
        this.setArguments();
        this.getArguments();
    }

    public void setArguments() {
        System.out.println("Enter n: ");
        Scanner scan = new Scanner(System.in);
        this.arguments = scan.next();
    }

    public void getArguments() {
            System.out.println(reverseByArray(arguments));
    }

    public static String reverseByArray(String str) {
        char[] a = str.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }

}
