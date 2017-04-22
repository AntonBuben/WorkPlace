package by.anton.exercises.chapter_1;

import by.anton.exercises.Choice;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class RunExercisesC1 {
    private int chapter, exercise;

    public RunExercisesC1(Choice choice) {
        this.setExercises(choice);
        this.runExercises();
    }

    private void setExercises(Choice choice) {
        //Set the chapter and the exercise.
        this.chapter = choice.getChapter();
        this.exercise = choice.getExercise();
    }

    private void runExercises() {
        //Run exercise 1-6 from Chapter 1
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
        System.out.println("Chapter" + this.chapter + "done!");
    }
}
