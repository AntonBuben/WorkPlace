package by.anton.exercises.chapter_2;

import java.util.Random;

/**
 * Created by Anton on 22.04.2017.
 */
public class ArrayForExercises {
    private int arr[];
    private int COUNTS = 10;
    public ArrayForExercises() {
        this.setArray();
        this.printArray();

    }

    public void setArray() {
        this.arr = new int[COUNTS];
        Random random = new Random();
        for (int i: this.arr){
            arr[i] = random.nextInt(100);
        }
    }

    public void printArray() {
        System.out.println("The array : ");
        for (int i : this.arr){
            System.out.print(this.arr[i]+" ");
        }
    }
    public int[] getArray() {
        return arr;
    }
}

