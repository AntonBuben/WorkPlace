package by.anton.exercises.chapter_3.Exercise_3_1;

/**
 * Created by Buben_AV on 04.05.2017.
 */
public class PrintStudent {
    private Student students[];

    public void createStudents(int i) {
        students = new Student[i];
        for (int j = 0; j < i; j++) {
            students[j].setId(j+1);
            students[j].setFirstName();
            students[j].setLastName();
            students[j].setMiddleName();
            students[j].setDateOfBirth();
            students[j].setAddress()
            students[j].setTelephone();
        }
    }

    public void printStudentsOfFaculty(faculty physics) {
    }

    public void printStudentsOfFacultyAndCourse(faculty biology, course first) {
    }

    public void printStudentsAfterDate(int i) {
    }

    public void printGroup(group a) {
    }
}
