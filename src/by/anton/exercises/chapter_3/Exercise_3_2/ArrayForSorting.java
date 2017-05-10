package by.anton.exercises.chapter_3.Exercise_3_2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Buben_AV on 05.05.2017.
 */
public class ArrayForSorting {
    /**
     * The array for sorting
     */
    private int array[];
    /**
     * The number of elements
     */
    private final int COUNT = 200;

    /**
     * Set the array fo sorting by random
     *
     * @param length of an array
     */
    public void setRandomArray(int length) {
        array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(COUNT);
        }
        this.array = array;
    }

    /**
     * Print the array for sorting
     */
    public void printArray() {
        System.out.println(toString());
    }

    /**
     * Get the array for sorting
     *
     * @return array
     */
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
