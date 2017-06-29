package by.anton.exercises.chapter_3.Exercise_3_1;

import java.util.Random;

/**
 * Created by Buben_AV on 03.05.2017.
 */
public class Exercise_3_1 {
    private final String TASK = "Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,\n" +
            "Факультет, Курс, Группа.\n" +
            "Создать массив объектов. Вывести:\n" +
            "a) список студентов заданного факультета;\n" +
            "b) списки студентов для каждого факультета и курса;\n" +
            "c) список студентов, родившихся после заданного года;\n" +
            "d) список учебной группы.";

    public void doExercise_3_1(){
        System.out.println(TASK);
        PrintStudents printStudent = new PrintStudents();
        Random random = new Random();
        printStudent.createStudents(10);
        printStudent.printStudents();
        printStudent.printStudentsOfFaculty(Data.getFaculty(random.nextInt(4)));
        printStudent.printStudentsOfFacultyAndCourse(Data.getFaculty(random.nextInt(4)), Data.getCourse(random.nextInt(4)));
        printStudent.printStudentsAfterDate(Data.getDateOfBirth(random.nextInt(4)));
        printStudent.printGroup(Data.getGroup(random.nextInt(4)));
    }


}
