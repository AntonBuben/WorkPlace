package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
/**
 * Exercise 1 of chapter 2
 */
public class Exercise_2_1 {
    private final String TASK = "#1 Найти самое короткое и самое длинное число. Вывести найденные числа\n" +
            "и их длину.";
    private int arr[];

    public Exercise_2_1() {
        System.out.println(TASK);
        ArrayForExercises array = new ArrayForExercises();
        array.setArrayRandom();
        array.printArray();
        arr = array.getArray();
        int num, counts;
        num = numberMax();
        counts = getCountsOfDigits(num);
        System.out.println("Number max :"+num+" Counts : "+counts);
        num = numberMin();
        counts = getCountsOfDigits(num);
        System.out.println("Number min :"+num+" Counts : "+counts);

    }
    public int numberMax(){
        int max = arr[0];
        for (int i : arr){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    public int numberMin(){
        int min = Integer.MAX_VALUE;
        for (int i : arr){
            if (i < min){
                min = i;
            }
        }
        return min;
    }
    public int getCountsOfDigits(int number){
        return String.valueOf(Math.abs(number)).length();
    }
}
