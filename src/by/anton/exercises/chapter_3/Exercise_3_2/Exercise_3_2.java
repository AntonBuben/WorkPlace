package by.anton.exercises.chapter_3.Exercise_3_2;

import java.lang.reflect.Array;

/**
 * Created by Buben_AV on 03.05.LENGTH17.
 */

public class Exercise_3_2 {
    private String TASK = "Определить класс Массив. Создать методы сортировки: \n" +
            "обменная сортировка (метод пузырька); \n" +
            "обменная сортировка «Шейкер-сортировка»,-\n" +
            "сортировка посредством выбора (метод простого выбора), \n" +
            "сортировка вставками: метод хеширования (сортировка с вычислением адреса), \n" +
            "сортировка вставками (метод простых вставок), \n" +
            "сортировка бинарного слияния, \n" +
            "сортровка Шелла (сортировка с убывающим шагом).";
    private final int LENGTH = 20;

    public Exercise_3_2() {
        System.out.println(TASK);
        ArrayForSorting mas = new ArrayForSorting();
        Sorting sorting = new  Sorting();
        //The sorting by bubble sort
        mas.setRandomArray(LENGTH);
        mas.printArray();
        sorting.bubbleSort(mas.getArray());
        mas.printArray();
        //The sorting by cocktail sort
        mas.setRandomArray(LENGTH);
        mas.printArray();
        sorting.cocktailSort(mas.getArray());
        mas.printArray();
        //The sorting by selection sort
        mas.setRandomArray(LENGTH);
        mas.printArray();
        sorting.selectionSort(mas.getArray());
        mas.printArray();
        //The sorting by hashing sort
        mas.setRandomArray(LENGTH);
        mas.printArray();
        sorting.hashingSort(mas.getArray());
        mas.printArray();
        //The sorting by insertion sort
        mas.setRandomArray(LENGTH);
        mas.printArray();
        sorting.insertionSort(mas.getArray());
        mas.printArray();
        //The sorting by merge sort
        mas.setRandomArray(LENGTH);
        mas.printArray();
        sorting.mergeSort(mas.getArray());
        mas.printArray();
        //The sorting by shell sort
        mas.setRandomArray(LENGTH);
        mas.printArray();
        sorting.shellSort(mas.getArray());
        mas.printArray();
    }
}
