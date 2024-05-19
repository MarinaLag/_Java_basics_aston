package by.aston.java.base.lesson_2.inner;

public class Cat {
    String name;
    CatTail tail;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.tail=new CatTail(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", tail=").append(tail);
        sb.append('}');
        return sb.toString();
    }

    public  class CatTail{
        private  String color;
        private Enum anEnum;
        private static int age;

        public CatTail(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("CatTail{");
            sb.append("color='").append(color).append('\'');
            sb.append('}');
            return sb.toString();
        }
        private class Mlglglh{

        }
    }
}
