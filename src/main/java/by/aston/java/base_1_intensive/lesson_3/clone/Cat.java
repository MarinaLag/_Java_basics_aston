package by.aston.java.base_1_intensive.lesson_3.clone;

import java.util.Objects;

public class Cat implements Cloneable{
    String name;
    int age;
    Tail tail;

    public Cat(String name, int age, Tail tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(Tail tail) {
        this.tail = tail;
    }

    //    public Cat(Cat cat) {
//        this.name = cat.name;
//        this.age = cat.age;
//    }
//
//    public Cat creatCat(Cat cat){
//        return new Cat(cat.name, cat.age);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }

    public Tail getTail() {
        return tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //    @Override
//    protected Cat clone() throws CloneNotSupportedException {
//        (Cat) super.clone();
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", tail=").append(tail);
        sb.append('}');
        return sb.toString();
    }
}
