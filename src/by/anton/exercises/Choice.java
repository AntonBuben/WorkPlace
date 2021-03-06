package by.anton.exercises;

import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */

/**
 * Choice class uses to choice number of exercise and number of chapter
 */
public class Choice {
    private int chapter, exercise;

    /**
     * This is a constructor to set a chapter and an exercise by class Scanner
     */

    public Choice() {
        setChapter();
        setExercise();
    }

    /**
     * This is a constructor to set a chapter and an exercise by parameters
     * @param chapter
     * @param exercise
     */
    public Choice(int chapter, int exercise){
        setChapter(chapter);
        setExercise(exercise);
    }

    /**
     * This is a constructor to set a chapter and an exercise
     * @param chapter
     */
    public Choice(int chapter){
        this.chapter = chapter;
        setExercise();
    }

    /**
     * To get a chapter
     * @return chapter
     */
    public int getChapter() {
        return chapter;
    }

    /**
     * To get an exercise
     * @return exercise
     */
    public int getExercise() {
        return exercise;
    }

    /**
     * To set a chapter
     */
    public void setChapter() {
        System.out.println("Enter a chapter (1-10):");
        Scanner scan = new Scanner(System.in);
        int chapter = scan.nextInt();
        if (chapter > 0 | chapter <10) {
            this.chapter = chapter;
        } else {
            System.out.println("The chapter is not correct");
        }

    }

    /**
     * To set a chapter
     * @param chapter
     */
    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    /**
     * To set an exercise
     */
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

    /**
     * To set an exercise
     * @param exercise
     */
    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    /**
     * To print a choice
     */
    public void printChoice(){
        System.out.print("The chapter: " + this.chapter + "The exercise: " + this.exercise);
    }

}
