package by.aston.java.base_1_intensive.home_work._9_home_work;

public class BuildPatternDemo {
    public static void main(String[] args) {

        // пирог может быть разным, взависимости от ингридиентов
        Cake whiteCake = new Cake.Builder()
                .sugar(1)
                .butter(0.3)
                .eggs(2)
                .build();
// торт готов
        System.out.println(whiteCake);


        Cake whiteCake1 = new Cake.Builder()
                .sugar(1)
                .eggs(2)
                .build();
// торт готов
        System.out.println(whiteCake1);
    }

}
