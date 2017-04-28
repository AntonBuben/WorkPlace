package by.anton.exercises.chapter_2;

import java.net.PortUnreachableException;
import java.util.Random;

/**
 * Created by Anton on 22.04.2017.
 */
public class ArrayForExercises {
    private int arr[];
    private int matrix[][];
    private final int COUNT = 10;
    private final int rand = 100;
    public ArrayForExercises() {
    }

    public int getCOUNT() {
        return COUNT;
    }

    public void setArray(int[] arr) {
        this.arr = arr;
    }

    public int[] getArray() {
        return arr;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setArrayRandom() {
        this.arr = new int[COUNT];
        Random random = new Random();
        for (int i=0; i<COUNT; i++){
            arr[i] = random.nextInt(rand);
        }
    }

    public void setMatrixRandom(){
        this.matrix = new int[COUNT][COUNT];
        Random random = new Random();
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {
                matrix[i][j] = random.nextInt(rand);
            }
        }
    }

    public void printArray() {
        System.out.println("The array : ");
        for (int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public void printMatrix(){
        System.out.println("The matrix : ");
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}

