package by.anton.exercises.chapter_2;

import by.anton.exercises.Choice;

/**
 * Created by Anton on 22.04.2017.
 */
public class RunExerciseC2 {
    private int chapter, exercise;
    public RunExerciseC2(Choice choice) {
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
            case 7:
                new Exercise_2_7();
                break;
            case 8:
                new Exercise_2_8();
                break;
            case 9:
                new Exercise_2_9();
                break;
            case 10:
                new Exercise_2_10();
                break;
            default:
                System.out.println("No exercise!");
        }
        System.out.println("Chapter" + this.chapter + "done!");
    }
}
