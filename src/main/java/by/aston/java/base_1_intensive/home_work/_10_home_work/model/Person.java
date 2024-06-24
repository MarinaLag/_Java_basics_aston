package by.aston.java.base_1_intensive.home_work._10_home_work.model;

public class Person {
    int id;
    String email;
    String firstname;

    public Person(int id, String firstname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
