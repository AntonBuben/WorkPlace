package by.anton.exercises.chapter_1;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Buben_AV on 22.03.2017.
 */
/**
 * Exercise 6 of chapter 1
 */
public class Exercise_1_6 {
    private final String TASK = "#6 Вывести фамилию разработчика, дату и время получения задания, а также\n" +
            "дату и время сдачи задания.";
    private String fio;
    private Date dateOfTask;
    private Date dateOfFinish;
    
    public Exercise_1_6() {
        System.out.println(TASK);
        this.getFIO();
        this.getDateOfTask();
        this.getDateOfFinish();
    }

    public void getFIO() {

        System.out.println("Enter FIO :");
        Scanner scan = new Scanner(System.in);
        this.fio =scan.nextLine();
        System.out.println("FIO : "+this.fio);
    }

    public void getDateOfTask() {
        this.dateOfTask = new Date();
        this.dateOfTask.getDate();
        System.out.println("Date of task : "+this.dateOfTask);
    }

    public void getDateOfFinish() {
        if (this.dateOfTask != null) {
            this.dateOfFinish = new Date(this.dateOfTask.getTime()+(60*60*24*7));
        }
        System.out.println("Date of finish : "+this.dateOfFinish);
    }

}
