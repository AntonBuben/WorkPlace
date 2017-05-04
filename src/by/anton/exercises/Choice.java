package by.anton.exercises;

import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Choice {
    private int chapter, exercise;

    public Choice() {
        setChapter();
        setExercise();
    }

    public int getChapter() {
        return chapter;
    }

    public int getExercise() {
        return exercise;
    }

    public void setChapter() {
        System.out.println("Enter a chapter (1-10):");
//        Scanner scan = new Scanner(System.in);
        int chapter = 3; //scan.nextInt();
        if (chapter > 0 | chapter <10) {
            this.chapter = chapter;
        } else {
            System.out.println("The chapter is not correct");
        }

    }

    public void setExercise() {
        System.out.println("Enter a exercise (1-6):");
        Scanner scan = new Scanner(System.in);
        int exercise = scan.nextInt();
        if (exercise > 0 | exercise < 7) {
            this.exercise = exercise;
        } else {
            System.out.println("The exercise is not correct");
        }
    }

    public void printChoice(){
        System.out.print("The chapter: " + this.chapter + "The exercise: " + this.exercise);
    }

}
