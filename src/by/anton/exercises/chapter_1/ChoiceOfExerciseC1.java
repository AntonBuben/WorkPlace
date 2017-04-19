package by.anton.exercises.chapter_1;

import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class ChoiceOfExerciseC1 {
    private int chapter, exercise;

    public int getChapter() {
        return chapter;
    }

    public int getExercise() {
        return exercise;
    }

    public void setExercise() {
        System.out.println("Enter Chapter 1..10:");
        Scanner scan1 = new Scanner(System.in);
        this.chapter = scan1.nextInt();
        //this.chapter = 1;

        System.out.println("Enter Exercise 1..10:");
        Scanner scan2 = new Scanner(System.in);
        this.exercise = scan2.nextInt();
        //this.exercise = 1;

        System.out.print("Chapter: " + chapter + "Exercise: " + exercise);
    }

}
