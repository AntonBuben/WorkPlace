package by.anton.exercises.chapter_3.Exercise_3_2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Buben_AV on 05.05.2017.
 */
public class ArrayForSorting {
    private int array[];
    private final int COUNT = 200;

    public void setRandomArray(int length) {
        array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(COUNT);
        }
        this.array = array;
    }

    public void printArray() {
        System.out.println(toString());
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "ArrayForSorting : {" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
