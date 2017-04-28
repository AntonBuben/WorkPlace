package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_2_3 {
    private final String TASK = "#3 Вывести на консоль те числа, длина которых меньше (больше) средней,\n" +
            "а также длину.";
    private int arr[];

    public Exercise_2_3() {
        System.out.println(TASK);
        ArrayForExercises arr = new ArrayForExercises();
        arr.setArrayRandom();
        arr.printArray();
        this.arr = arr.getArray();
        this.sortByMedium();
    }

    private void sortByMedium(){
        int count[] = new int[this.arr.length];
        int medium = 0;
        for (int i = 0; i < this.arr.length; i++) {
            count[i]=String.valueOf(Math.abs(this.arr[i])).length();
            medium += count[i];
        }
        medium = (medium / count.length);
        System.out.println(medium);
        System.out.println("The numbers : ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] <= medium) {
                System.out.println(this.arr[i]+"("+count[i]+") ");
            }
        }
    }
}
