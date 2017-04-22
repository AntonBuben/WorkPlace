package by.anton;

import by.anton.exercises.Choice;
import by.anton.exercises.chapter_1.RunExercisesC1;
import by.anton.exercises.chapter_2.RunExercisesC2;

import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
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

        switch (choice.getChapter()){
                case 1: new RunExercisesC1(choice); break;
                case 2: new RunExercisesC2(choice); break;
//                case 3: new RunExercisesC3(choice); break;
            }


     //PS String urlInfo = "${info}";
    }
}
