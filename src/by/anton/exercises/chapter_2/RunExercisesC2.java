package by.anton.exercises.chapter_2;

import by.anton.exercises.Choice;

/**
 * Created by Anton on 22.04.2017.
 */
public class RunExercisesC2 {
    private int chapter, exercise;
    public RunExercisesC2(Choice choice) {
        this.setExercises(choice);
        this.runExercises();
    }
    public void setExercises(Choice choice){
        this.chapter = choice.getChapter();
        this.exercise = choice.getExercise();
    }
    public void runExercises(){
        switch (this.exercise) {
            case 1:
                new Exercise_2_1();
                break;
            case 2:
                new Exercise_2_2();
                break;
            case 3:
                new Exercise_2_3();
                break;
            case 4:
                new Exercise_2_4();
                break;
            case 5:
                new Exercise_2_5();
                break;
            case 6:
                new Exercise_2_6();
                break;
            default:
                System.out.println("No exercise!");
        }
        System.out.println("Chapter " + this.chapter + " done!");
    }
}
