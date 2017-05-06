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
        int itr = 0;
        int swap = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swapNumbers(array, j, j + 1);
                    swap++;
                }
                itr++;
            }
        }
        System.out.println("The sorting is done! Iterations are : " + itr + " Swap is : " + swap);
    }

    public void cocktailSort(int array[]) {
        int itr = 0;
        int swap = 0;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swapNumbers(array, i, i + 1);
                    swap++;
                }
                itr++;
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    swapNumbers(array, i, i - 1);
                }
                itr++;
            }
            left++;
        } while (left <= right);
        System.out.println("The sorting is done! Iterations are : " + itr + " Swap is : " + swap);
    }

    public void selectionSort(int array[]) {
        int itr = 0;
        int swap = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                itr++;
            }
            itr++;
            swapNumbers(array, i, min);
            swap++;
        }
        System.out.println("The sorting is done! The iterations are : " + itr + " Swap is : " + swap);
    }

    public void insertionSort(int array[]) {
        int itr = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                swapNumbers(array, j - 1, j);
                itr++;
            }
        }
        System.out.println("The sorting is done! The iterations are : " + itr+ " Swap is : " + itr);
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
