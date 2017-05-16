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
    private final String TASK = "Создать консольное приложение, удовлетворяющее следующим требованиям:\n" +
            "• Использовать возможности ООП: классы, наследование, полиморфизм, ин-\n" +
            "капсуляция.\n" +
            "• Каждый класс должен иметь отражающее смысл название и информатив-\n" +
            "ный состав.\n" +
            "• Наследование должно применяться только тогда, когда это имеет смысл.\n" +
            "• При кодировании должны быть использованы соглашения об оформлении\n" +
            "кода java code convention.\n" +
            "• Классы должны быть грамотно разложены по пакетам.\n" +
            "• Консольное меню должно быть минимальным.\n" +
            "• Для хранения параметров инициализации можно использовать файлы." +
            "" +
            "" +
            "";

    /**
     * This is a constructor to run the exercise 4_1
     */
    public Exercise_4_1() {
        CountryReport countryReport = new CountryReport();
        countryReport.printCountry(countryReport.createCountry());
    }
}
