package by.aston.java.base_1_intensive.home_work._10_home_work.service;

import by.aston.java.base_1_intensive.home_work._10_home_work.model.Person;

import java.util.List;

public class PersonService {
    private final static PersonService INSTANCE = new PersonService();

    private final List<Person> persons = List.of(new Person(1, "invan@yandex.ru", "Ivan"),
            new Person(2, "maxim@yandex.ru", "Maxim"));

    private PersonService() {

    }

    public Person getById(int id) {
        return persons.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElseThrow();
    }

    public static PersonService getInstance() {
        return INSTANCE;
    }
}
