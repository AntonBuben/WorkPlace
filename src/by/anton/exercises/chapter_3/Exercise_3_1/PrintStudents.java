package by.anton.exercises.chapter_3.Exercise_3_1;

import java.util.Random;

/**
 * Created by Buben_AV on 04.05.2017.
 */
public class PrintStudents {
    private Student students[];

    public void createStudents(int i) {
        students = new Student[i];
        Random random = new Random();
        for (int j = 0; j < i; j++) {
            Student student = new Student();
            student.setId(j + 1);
            student.setFirstName(Data.getFirstName(random.nextInt(4)));
            student.setLastName(Data.getLastName(random.nextInt(4)));
            student.setMiddleName(Data.getMiddleName(random.nextInt(4)));
            student.setYearOfBirth(Data.getDateOfBirth(random.nextInt(4)));
            student.setAddress(Data.getAddress(random.nextInt(4)));
            student.setTelephone(Data.getTelephone(random.nextInt(4)));
            University university = new University();
            university.setCourse(Data.getCourse(random.nextInt(4)));
            university.setFaculty(Data.getFaculty(random.nextInt(4)));
            university.setGroup(Data.getGroup(random.nextInt(4)));
            student.setUniversity(university);
            students[j] = student;
        }
    }

    public void printStudent(int i) {
        System.out.println(students[i].toString());
    }

    public void printStudents() {
        System.out.println("The students : ");
        for (int i = 0; i < students.length; i++) {
            printStudent(i);
        }
    }

    public void printStudentsOfFaculty(String faculty) {
        System.out.println("The students of faculty " + faculty + " : ");
        University university;
        for (int i = 0; i < students.length; i++) {
            university = students[i].getUniversity();
            if (university.getFaculty() == faculty) {
                printStudent(i);
            }
        }
    }

    public void printStudentsOfFacultyAndCourse(String faculty, String course) {
        System.out.println("The students of faculty " + faculty + " and course " + course + " : ");
        University university;
        for (int i = 0; i < students.length; i++) {
            university = students[i].getUniversity();
            if (university.getFaculty() == faculty && university.getCourse() == course) {
                printStudent(i);
            }
        }
    }

    public void printStudentsAfterDate(int dateOfBirth) {
        System.out.println("The students are after " + dateOfBirth + " : ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getYearOfBirth() >= dateOfBirth) {
                printStudent(i);
            }
        }
    }

    public void printGroup(String group) {
        System.out.println("The students of " + group + " : ");
        University university;
        for (int i = 0; i < students.length; i++) {
            university = students[i].getUniversity();
            if (university.getGroup() == group) {
                printStudent(i);
            }
        }
    }
}
