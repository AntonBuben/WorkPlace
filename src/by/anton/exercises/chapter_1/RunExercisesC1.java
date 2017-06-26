package by.anton.exercises.chapter_1;

import by.anton.exercises.Choice;

/**
 * Created by Buben_AV on 22.03.2017.
 */

/**
 * INTRODUCTION TO OOP AND CLASSES
 */
public class RunExercisesC1 {
    /**
     * a chapter and an exercise
     */
    private int chapter, exercise;

    /**
     * To run exercises of chapter 1
     * @param choice
     */
    public RunExercisesC1(Choice choice) {
        this.setExercises(choice);
        this.runExercises();
    }

    /**
     * To set a chapter and an exercise.
     * @param choice
     */
    private void setExercises(Choice choice) {
        this.chapter = choice.getChapter();
        this.exercise = choice.getExercise();
    }

    /**
     * To run exercises
     */
    private void runExercises() {
        switch (this.exercise) {
            case 1:
                new Exercise_1_1();
                break;
            case 2:
                new Exercise_1_2();
                break;
            case 3:
                new Exercise_1_3();
                break;
            case 4:
                new Exercise_1_4();
                break;
            case 5:
                new Exercise_1_5();
                break;
            case 6:
                new Exercise_1_6();
                break;
            default:
                System.out.println("No exercise!");
        }
        System.out.println("Exercise " +this.chapter+"_"+ this.exercise + " done!");
    }
}
