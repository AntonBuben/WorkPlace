package by.anton.exercises.chapter_1;

import by.anton.exercises.chapter_2.*;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class RunExercisesC1 {
    private int chapter, exercise;

    public RunExercisesC1() {
        this.setExercises();
        this.runExercises();
    }

    private void setExercises() {
        //Set the chapter and the exercise.
        ChoiceOfExerciseC1 choice = new ChoiceOfExerciseC1();
        choice.setExercise();
        this.chapter = choice.getChapter();
        this.exercise = choice.getExercise();
    }

    private void runExercises() {
        //Run the exercise
        switch (this.chapter) {
            case 1:
                //Chapter 1 examples 1-6
                switch (this.exercise) {
                    case 1:
                        //Exercise №1
                        System.out.println("#1 Приветствовать любого пользователя при вводе его имени через командную строку.");
                        Exercise_1_1 ex1 = new Exercise_1_1();
                        break;
                    case 2:
                        // Exercise №2
                        System.out.println("#2 Отобразить в окне консоли аргументы командной строки в обратном порядке.");
                        Exercise_1_2 ex2 = new Exercise_1_2();
                        break;
                    case 3:
                        // Exercise №3
                        System.out.println("#3 Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
                        Exercise_1_3 ex3 = new Exercise_1_3();
                        break;
                    case 4:
                        // Exercise №4
                        System.out.println("#4 Ввести пароль из командной строки и сравнить его со строкой-образцом.");
                        Exercise_1_4 ex4 = new Exercise_1_4();
                        break;
                    case 5:
                        // Exercise №5
                        System.out.println("#5 Ввести целые числа как аргументы командной строки, подсчитать их сум мы (произведения) и вывести результат на консоль.");
                        Exercise_1_5 ex5 = new Exercise_1_5();
                        break;
                    case 6:
                        // Exercise №6
                        System.out.println("#6 Вывести фамилию разработчика, дату и время получения задания, а также дату и время сдачи задания.");
                        Exercise_1_6 ex6 = new Exercise_1_6();
                        break;
                    default:
                        System.out.println("No exercise!");
                }
                System.out.println("Chapter 1 done!");
                break;
            //Chapter 2 examples 1-10
            case 2:
                switch (this.exercise) {
                    case 1:
                        // Exercise №1
                        System.out.println("#1 Ввести с консоли n целых чисел. На консоль вывести: Четные и нечетные числа.");
                        Exercise_2_1 ex1 = new Exercise_2_1();
                        break;
                    case 2:
                        // Exercise №2
                        System.out.println("#2 Ввести с консоли n целых чисел. На консоль вывести: Наибольшее и наименьшее число.");
                        Exercise_2_2 ex2 = new Exercise_2_2();
                        break;
                    case 3:
                        // Exercise №3
                        System.out.println("#3 Ввести с консоли n целых чисел. На консоль вывести: Числа, которые делятся на 3 или на 9.");
                        Exercise_2_3 ex3 = new Exercise_2_3();
                        break;
                    case 4:
                        // Exercise №4
                        System.out.println("#4 Ввести с консоли n целых чисел. На консоль вывести: Числа, которые делятся на 5 и на 7.");
                        Exercise_2_4 ex4 = new Exercise_2_4();
                        break;
                    case 5:
                        // Exercise №5
                        System.out.println("#5 Ввести с консоли n целых чисел. На консоль вывести: Элементы, расположенные методом пузырька по убыванию модулей.");
                        Exercise_2_5 ex5 = new Exercise_2_5();
                        break;
                    case 6:
                        // Exercise №6
                        System.out.println("#6 Ввести с консоли n целых чисел. На консоль вывести: Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.");
                        Exercise_2_6 ex6 = new Exercise_2_6();
                        break;
                    case 7:
                        // Exercise №7
                        System.out.println("#7 Ввести с консоли n целых чисел. На консоль вывести: Наибольший общий делитель и наименьшее общее кратное этих чисел.");
                        Exercise_2_7 ex7 = new Exercise_2_7();
                        break;
                    case 8:
                        // Exercise №8
                        System.out.println("#8 Ввести с консоли n целых чисел. На консоль вывести: Простые числа.");
                        Exercise_2_8 ex8 = new Exercise_2_8();
                        break;
                    case 9:
                        // Exercise №9
                        System.out.println("#9 Ввести с консоли n целых чисел. На консоль вывести: Отсортированные числа в порядке возрастания и убывания.");
                        Exercise_2_9 ex9 = new Exercise_2_9();
                        break;
                    case 10:
                        // Exercise №10
                        System.out.println("#10 Ввести с консоли n целых чисел. На консоль вывести: Числа в порядке убывания частоты встречаемости чисел.");
                        Exercise_2_10 ex10 = new Exercise_2_10();
                        break;
                    default:
                        System.out.println("No exercise!");
                }
                System.out.println("Chapter 2 done!");
                break;
            default:
                System.out.println("No chapter!");
        }
        //
    }
}
