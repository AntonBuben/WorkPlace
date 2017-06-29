package by.anton;

import by.anton.exercises.Choice;
import by.anton.exercises.chapter_1.RunExercisesC1;
import by.anton.exercises.chapter_2.RunExercisesC2;
import by.anton.exercises.chapter_3.RunExercisesC3;
import by.anton.exercises.chapter_4.RunExercisesC4;

/**
 * Created by Buben_AV on 22.03.2017.
 */

/**
 * Main class uses for run all exercises of all chapters
 */
public class Main {

    public static void main(String[] args) {
        // do exercises
        Choice choice = new Choice();
//        Class runEx = null;
//        try {
//            runEx = Class.forName("RunExercisesC"+choice.getChapter());
//            Object ref = runEx.newInstance();
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        ref.setExercise(choice);

        switch (choice.getChapter()) {
            case 1:
                // INTRODUCTION TO OOP AND CLASSES
                new RunExercisesC1(choice);
                break;
            case 2:
                // DATA TYPES AND OPERATORS
                new RunExercisesC2(choice);
                break;
            case 3:
                //CLASSES AND OBJECTS
                new RunExercisesC3(choice);
                break;
            case 4:
                //INHERITANCE AND POLYMORPHISM
                new RunExercisesC4(choice);
                break;
            case 5:
                //INNER CLASSES
//                new RunExercisesC5(choice);
                break;
        }


        //PS String urlInfo = "${info}";
    }
}