package by.anton.exercises.chapter_3.Exercise_3_3;

/**
 * Created by Anton on 10.05.2017.
 */

/**
 *
 */
public class Exercise_3_3 {
    /**
     * Task for the exercise 3_2
     */
    private final String TASK = "Создать приложение, удовлетворяющее требованиям, приведенным в зада-\n" +
            "нии. Наследование применять только в тех заданиях, в которых это логически\n" +
            "обосновано. Аргументировать принадлежность классу каждого создаваемого\n" +
            "метода и корректно переопределить для каждого класса методы equals(),\n" +
            "hashCode(), toString()." +
            "Создать объект класса Государство, используя классы Область, Район,\n" +
            "Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.";

    /**
     * This is a constructor to run the exercise 3_3
     */
    public Exercise_3_3() {
        CountryReport countryReport = new CountryReport();
        countryReport.printCountry(countryReport.createCountry());
    }

}
