package by.anton.exercises.chapter_3;

import by.anton.exercises.Choice;
import by.anton.exercises.chapter_3.Exercise_3_1.Exercise_3_1;
import by.anton.exercises.chapter_3.Exercise_3_2.Exercise_3_2;

/**
 * Created by Buben_AV on 03.05.2017.
 */
public class RunExercisesC3 {
    private int chapter, exercise;

    public RunExercisesC3(Choice choice) {
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
                new Exercise_3_1();
                break;
            case 2:
                new Exercise_3_2();
                break;
            default:
                System.out.println("No exercise!");
        }
        System.out.println("Chapter" + this.chapter + "done!");
    }
}
