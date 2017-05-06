package by.anton.exercises.chapter_3.Exercise_3_2;

/**
 * Created by Buben_AV on 05.05.2017.
 */
public class Sorting {
    private void swapNumbers(int array[], int pos1, int pos2) {
        int temp;
        temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public void bubbleSort(int array[]) {
        int temp, itr = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swapNumbers(array, j, j + 1);
                }
                itr++;
            }
        }
        System.out.println("The sorting is done! Iterations are : " + itr);
    }

    public void cocktailSort(int array[]) {
        int temp, itr = 0;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swapNumbers(array, i, i + 1);
                }
                right--;
                itr++;
            }
            for (int i = right; i > left + 1; i--) {
                if (array[i] < array[i - 1]) {
                    swapNumbers(array, i, i + 1);
                }
                left++;
                itr++;
            }
        } while (left < right);
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
