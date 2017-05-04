package by.anton.exercises.chapter_3.Exercise_3_1;


/**
 * Created by Anton on 04.05.2017.
 */
public class Data {
    private static String firstName[] = {"Gena", "Sergey", "Timur", "Vanya", "Lena"};
    private static String lastName[] = {"Smirnov", "Blinov", "Efimov", "Ivanov", "Petrov"};
    private static String middleName[] = {"Alexandrovich", "Igorevich", "Sergeevich", "Victorovich", "Vladimirovich"};
    private static int dateOfBirth[] = {1992, 1998, 1991, 2000, 1995};
    private static String address[] = {"Minsk...", "Grodno..", "Mogilev..", "Brest..", "Vitebsk..."};
    private static String telephone[] = {"123456", "455632", "34516", "23512", "23231"};
    private static String faculty[] = {"Math", "Chemistry", "Biology", "Physics", "Language"};
    private static String course[] = {"first", "second", "third", "fourth", "fifth"};
    private static String group[] = {"A", "B", "C", "D", "F"};

    public static String getFirstName(int i) {
        return firstName[i];
    }

    public static String getLastName(int i) {
        return lastName[i];
    }

    public static String getMiddleName(int i) {
        return middleName[i];
    }

    public static int getDateOfBirth(int i) {
        return dateOfBirth[i];
    }

    public static String getAddress(int i) {
        return address[i];
    }

    public static String getTelephone(int i) {
        return telephone[i];
    }

    public static String getFaculty(int i) {
        return faculty[i];
    }

    public static String getCourse(int i) {
        return course[i];
    }

    public static String getGroup(int i) {
        return group[i];
    }
}
