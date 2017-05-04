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
            students[j].setId(j+1);
            students[j].setFirstName(Data.getFirstName(random.nextInt(4)));
            students[j].setLastName(Data.getLastName(random.nextInt(4)));
            students[j].setMiddleName(Data.getMiddleName(random.nextInt(4)));
            students[j].setDateOfBirth(Data.getDateOfBirth(random.nextInt(4)));
            students[j].setAddress(Data.getAddress(random.nextInt(4)));
            students[j].setTelephone(Data.getTelephone(random.nextInt(4)));
            University university = new University();
            university.setCourse(Data.getCourse(random.nextInt(4)));
            university.setFaculty(Data.getFaculty(random.nextInt(4)));
            university.setGroup(Data.getGroup(random.nextInt(4)));
            students[j].setUniversity(university);
        }
    }

    public void printStudentsOfFaculty(String faculty) {
    }

    public void printStudentsOfFacultyAndCourse(String faculty,String course) {
    }

    public void printStudentsAfterDate(int i) {
    }

    public void printGroup(String group) {
    }
}
