package by.anton.exercises.chapter_4.Exercise_4_2;

/**
 * Created by Buben_AV on 16.05.2017.
 */
public class Exercise_4_2 {
    /**
     * Task for the exercise 4_2
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
            "• Для хранения параметров инициализации можно использовать файлы.\n" +
            "Счета. Клиент может иметь несколько счетов в банке. Учитывать возмож-\n" +
            "ность блокировки/разблокировки счета. Реализовать поиск и сортировку\n" +
            "счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем\n" +
            "счетам, имеющим положительный и отрицательный балансы отдельно.";

    /**
     * This is a constructor to run the exercise 4_2
     */
    public Exercise_4_2() {
        Customer customer = new Customer();
        CreditAccount creditAccount = new CreditAccount(customer);
        DebitAccount debitAccount = new DebitAccount(customer);
        Bank bank = new Bank();
        bank.openAccount(creditAccount);
        bank.closeAccount(creditAccount);
        bank.openAccount(debitAccount);
        bank.blockAccount(debitAccount);
        bank.unBlockAccount(debitAccount);
        bank.sortAccountsByName();
        bank.searchAccountByName(customer.getName);
        bank.sumCreditAccounts();
        bank.sumDebitAccounts();
    }
}
