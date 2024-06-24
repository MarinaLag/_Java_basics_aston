package by.aston.java.base_1_intensive.lesson_2.inner;

public  class Building {
    private String name, address, type;

    Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    static void print(){
        class DDDD{

        }
    }
    void printInfo(){
        class MMMMM{

        }
    }

    public static class Platform extends Building {
        public Platform(String name, String address) {
            super(name, address);
            setType("Platform");
        }

        // some additional logic
    }

    public static class House extends Building {
        int hjj;
        static int GGG;

        static  class HHH{

        }
        public House(String name, String address) {
            super(name, address);
            setType("House");
        }
         void info(){
            System.out.println("kkk");
        }
        // some additional logic
    }

    public static class Shop extends Building {
        public Shop(String name, String address) {
            super(name, address);
            setType("Shop");
        }

        // some additional logic
    }

    // getters/setters
}
