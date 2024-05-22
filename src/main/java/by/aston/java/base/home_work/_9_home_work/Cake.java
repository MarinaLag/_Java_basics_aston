package by.aston.java.base.home_work._9_home_work;

public class Cake {
    private final double sugar;  // чашка
    private final double butter;
    private final int eggs;
    //,,,,,,

    // взависимости от ингридиентов разные конструкторы могут быть
  /*  public Cake(double sugar, double butter, int eggs) {
        this.sugar = sugar;
        this.butter = butter;
        this.eggs = eggs;
        //......
    }*/

    public static class Builder {
        private double sugar;
        private double butter;
        private int eggs;
        //....

        // методы задают свойства
        public Builder sugar(double cup) {
            this.sugar = cup;
            return this;
        }

        public Builder butter(double cup) {
            this.butter = cup;
            return this;
        }

        public Builder eggs(int number) {
            this.eggs = number;
            return this;
        }
        //....

        // метод возвращает готовый объект
        public Cake build() {
            return new Cake(this);
        }
    }

    // закрытый конструктор для принудительного созд объекта
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cake{");
        sb.append("sugar=").append(sugar);
        sb.append(", butter=").append(butter);
        sb.append(", eggs=").append(eggs);
        sb.append('}');
        return sb.toString();
    }
}
