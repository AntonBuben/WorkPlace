package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_2_1 {
    private final String TASK = "#1 Ввести с консоли n целых чисел. На консоль вывести: Четные и нечетные числа.";
    private int arr[];

    public Exercise_2_1() {
        System.out.println(TASK);
        ArrayForExercises array = new ArrayForExercises();
        arr = array.getArray();
        int num, counts;
        num = numberMax();
        counts = getCountsOfDigits(num);
        System.out.println("Number max :"+num+"Counts : "+counts);
        num = numberMin();
        counts = getCountsOfDigits(num);
        System.out.println("Number max :"+num+"Counts : "+counts);

    }
    public int numberMax(){
        int max = 0;
        for (int i : arr){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public int numberMin(){
        int min = 2147483647;
        for (int i : arr){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public int getCountsOfDigits(int number){
        return String.valueOf(Math.abs(number)).length();
    }
}
