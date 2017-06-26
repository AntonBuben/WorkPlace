//package by.anton.exercises.chapter_4.Exercise_4_2;
//
//import java.util.Random;
//
///**
// * Created by Buben_AV on 16.05.2017.
// */
//public class Exercise_4_2 {
//    /**
//     * Task for the exercise 4_2
//     */
//    private final String TASK = "Создать консольное приложение, удовлетворяющее следующим требованиям:\n" +
//            "• Использовать возможности ООП: классы, наследование, полиморфизм, ин-\n" +
//            "капсуляция.\n" +
//            "• Каждый класс должен иметь отражающее смысл название и информатив-\n" +
//            "ный состав.\n" +
//            "• Наследование должно применяться только тогда, когда это имеет смысл.\n" +
//            "• При кодировании должны быть использованы соглашения об оформлении\n" +
//            "кода java code convention.\n" +
//            "• Классы должны быть грамотно разложены по пакетам.\n" +
//            "• Консольное меню должно быть минимальным.\n" +
//            "• Для хранения параметров инициализации можно использовать файлы.\n" +
//            "Счета. Клиент может иметь несколько счетов в банке. Учитывать возмож-\n" +
//            "ность блокировки/разблокировки счета. Реализовать поиск и сортировку\n" +
//            "счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем\n" +
//            "счетам, имеющим положительный и отрицательный балансы отдельно.";
//    private String firstNames[] = {"Vanja", "Kolja", "Sergey", "Egor", "Maksim"};
//    private String secondNames[] = {"Ivanov", "Petrov", "Sidorov", "Bogin", "Vasjkin"};
//    private final int MAX_CLIENTS = 10;
//    private final int MAX_ACCOUNTS = 5;
//
//    /**
//     * This is a constructor to run the exercise 4_2
//     */
//    public Exercise_4_2() {
//        Bank bank = new Bank("Belarus");
//        Customer customer = null;
//        Random random = new Random();
////        CreditAccount creditAccount = null;
////        DebitAccount debitAccount = null;
//        for (int i = 0; i < MAX_CLIENTS; i++) {
//            customer = new Customer(firstNames[random.nextInt(firstNames.length)], secondNames[random.nextInt(secondNames.length)]);
//            for (int j = 0; j < random.nextInt(MAX_ACCOUNTS); j++) {
//                bank.openCreditAccount(customer);
//                bank.openDebitAccount(customer);
//            }
//        }
//
//        bank.closeAccount(creditAccount);
//        bank.blockAccount(debitAccount);
//        bank.unBlockAccount(debitAccount);
//        bank.sortAccountsByName();
//        bank.searchAccountByName(customer.getFirstName());
//        bank.sumCreditAccounts();
//        bank.sumDebitAccounts();
//    }
//}
