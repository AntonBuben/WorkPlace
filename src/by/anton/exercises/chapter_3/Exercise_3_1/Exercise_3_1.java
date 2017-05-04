package by.anton.exercises.chapter_3.Exercise_3_1;

import java.util.Date;

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

    public Exercise_3_1() {
        System.out.println(TASK);
        PrintStudent printStudent = new PrintStudent();
        printStudent.createStudents(10);
        printStudent.printStudentsOfFaculty(faculty.Physics);
        printStudent.printStudentsOfFacultyAndCourse(faculty.Biology,course.first);
        printStudent.printStudentsAfterDate(1985);
        printStudent.printGroup(group.A);
    }





}
