package by.anton.exercises.chapter_3.Exercise_3_2;

/**
 * Created by Buben_AV on 05.05.2017.
 */
public class Sorting {
    public void bubbleSort(int array[]) {
        int temp, itr = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                }
                itr++;
            }
        }
        System.out.println("The sorting is done! Iterations are : " + itr);
    }
    public void cocktailSort(int array[]) {
        int itr = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                }
                itr++;
            }

        System.out.println("The sorting is done! Iterations are : " + itr);
    }

    public void selectionSort(int array[]) {
        int itr = 0;


        System.out.println("The sorting is done! The iterations are : " + itr);
    }

    public void hashingSort(int array[]) {
        int itr = 0;


        System.out.println("The sorting is done! The iterations are : " + itr);
    }

    public void insertionSort(int array[]) {
        int itr = 0;


        System.out.println("The sorting is done! The iterations are : " + itr);
    }

    public void mergeSort(int array[]) {
        int itr = 0;


        System.out.println("The sorting is done! The iterations are : " + itr);
    }

    public void shellSort(int array[]) {
        int itr = 0;


        System.out.println("The sorting is done! The iterations are : " + itr);
    }
}
