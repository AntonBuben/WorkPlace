package by.anton.exercises.chapter_2;

import java.util.Random;

/**
 * Created by Anton on 22.04.2017.
 */
public class ArrayForExercises {
    private int arr[];
    private final int COUNT = 10;
    public ArrayForExercises() {
        this.setArrayRandom();
        this.printArray();

    }

    public int getCOUNT() {
        return COUNT;
    }

    public void setArray(int[] arr) {
        this.arr = arr;
    }

    public void setArrayRandom() {
        this.arr = new int[COUNT];
        Random random = new Random();
        for (int i=0; i<COUNT; i++){
            arr[i] = random.nextInt(200);
        }
    }

    public void printArray() {
        System.out.println("The array : ");
        for (int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public int[] getArray() {
        return arr;
    }

}

