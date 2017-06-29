package by.anton.exercises.chapter_4;

import by.anton.exercises.Choice;
import by.anton.exercises.chapter_4.Exercise_4_1.Exercise_4_1;
import by.anton.exercises.chapter_4.Exercise_4_2.Exercise_4_2;

/**
 * Created by Buben_AV on 03.05.2017.
 */

/**
 * CLASSES AND OBJECTS
 */
public class RunExercisesC4 {
    private int chapter, exercise;

    public RunExercisesC4(Choice choice) {
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
                Exercise_4_1 exe1 = new Exercise_4_1();
                exe1.runExercise_4_1();
                break;
            case 2:
                Exercise_4_2 exe2 = new Exercise_4_2();
                exe2.runExercise_4_2();
                break;
            default:
                System.out.println("No exercise!");
        }
        System.out.println("Chapter " + this.chapter + " done!");
    }
}
