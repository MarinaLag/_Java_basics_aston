package by.aston.java.base.home_work._5_home_work;

import java.util.*;
import java.util.stream.Collectors;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader tommy = new Trader("Tommy", "Milan");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(tommy, 2011, 200),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
// 1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).
        transactions.stream()
                .filter(s -> s.getYear() == 2011)
                .sorted(new TransactionByValueComparator())
                .forEach(s -> System.out.println(s));
        System.out.println("================================");

// 2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        List<String> listCity = transactions.stream()
                .map(s -> s.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("listCity: " + listCity);
        System.out.println("===============================");

// 3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        transactions.stream()
                .filter(s -> s.getTrader().getCity().equals("Cambridge"))
                .map(s -> s.getTrader().getName())
                .sorted()
                .forEach(s -> System.out.println(s));
        System.out.println("==============================");

// 4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном
        String listName = transactions.stream()
                .map(s -> s.getTrader().getName())
                .sorted()
                .collect(Collectors.joining("; "));
        System.out.println(listName);
        System.out.println("==============================");

// 5. Выяснить, существует ли хоть один трейдер из Милана
        boolean any = transactions.stream()
                .anyMatch(s -> s.getTrader().getCity().equals("Milan"));
        System.out.println("Есть ли трейдер из Милана? " + any);
        System.out.println("================================");

// 6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        int sumValues = transactions.stream()
                .filter(s -> s.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.summingInt(Transaction::getValue));
        System.out.println(sumValues);
        System.out.println("================================");

// 7. Какова максимальная сумма среди всех транзакций?
        Optional maxValues1 = transactions.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Transaction::getValue)));
        System.out.println(maxValues1);

        Transaction maxValue = transactions.stream()
                .max(Transaction::compare).get();
        System.out.println("MAX value = " + maxValue.getValue());
        System.out.println("=================================");

// 8. Найти транзакцию с минимальной суммой?
        Transaction minValue = transactions.stream()
                .min(Transaction::compare).get();
        System.out.println("MIN value = " + minValue.getValue());

        // проверка на пустоту
        System.out.println("=============================");
        ArrayList<Integer> number = new ArrayList<>();
        Optional<Integer> min = number.stream().min(Integer::compare);
        if (min.isPresent()) {
            System.out.println(min.get());
        }
        System.out.println(min);
        System.out.println(number);

    }
}
