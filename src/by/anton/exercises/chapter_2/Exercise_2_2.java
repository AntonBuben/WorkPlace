package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
/**
 * Exercise 2 of chapter 2
 */
public class Exercise_2_2 {
    private final String TASK = "#2 Упорядочить и вывести числа в порядке возрастания (убывания) значений\n" +
            "их длины";
    private int arr[];

    public Exercise_2_2() {
        System.out.println(TASK);
        ArrayForExercises arr = new ArrayForExercises();
        arr.setArrayRandom();
        arr.printArray();
        this.arr = arr.getArray();
        arr.setArray(this.sortByCounts());
        arr.printArray();

    }
    public int[] sortByCounts(){
        int arr[] = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++){
            arr[i]=String.valueOf(Math.abs(this.arr[i])).length();
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        return arr;
    }
}
