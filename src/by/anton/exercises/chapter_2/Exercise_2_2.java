package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_2_2 {
    private final String TASK = "#2 Упорядочить и вывести числа в порядке возрастания (убывания) значений\n" +
            "их длины";
    private int arr[];

    public Exercise_2_2() {
        System.out.println(TASK);
        ArrayForExercises arr = new ArrayForExercises();
        this.arr = arr.getArray();
        arr.setArray(this.sortByCounts());
        arr.printArray();

    }
    public int[] sortByCounts(){
        int arr[] = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++){
            arr[i]=String.valueOf(Math.abs(this.arr[i])).length();
        }
        for (int i = 0; i <arr.length ; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        return arr;
    }
}
