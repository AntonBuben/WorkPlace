package by.anton.exercises.chapter_4.Exercise_4_1;

/**
 * Created by Anton on 10.05.2017.
 */

/**
 * Class Exercise_4_1 runs the exercise 4.1
 */
public class Exercise_4_1 {
    /**
     * Task for the exercise 4_1
     */
    private final String TASK = "Создать приложение, удовлетворяющее требованиям, приведенным в зада-\n" +
            "нии. Наследование применять только в тех заданиях, в которых это логически\n" +
            "обосновано. Аргументировать принадлежность классу каждого создаваемого\n" +
            "метода и корректно переопределить для каждого класса методы equals(),\n" +
            "hashCode(), toString()." +
            "Создать объект класса Государство, используя классы Область, Район,\n" +
            "Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.\n";
    /**
     * This is a constructor to run the exercise 4_1
     */
    public Exercise_4_1() {
        CountryReport countryReport = new CountryReport();
        countryReport.printCountry(countryReport.createCountry());
    }
}
