package by.aston.java.base_1_intensive.home_work._2_home_work.task_1;

import by.aston.java.base_1_intensive.home_work._2_home_work.task_1.inner_class.Spice;
import by.aston.java.base_1_intensive.home_work._2_home_work.task_1.inner_class.Wool;

public abstract class Mammals extends Animals {
    private Spice spice;
    private Wool colorWool;  // new Wool(black)

    public Mammals() {
    }

    // для кита
    public Mammals(String nickname, int age, String spiceAnimal) {
        super(nickname, age);
        this.spice = new Spice(spiceAnimal);
    }

    // для кошки и медведя
    public Mammals(String nickname, int age, String spiceAnimal, String wool) {
        super(nickname, age);
        this.spice = new Spice(spiceAnimal);
        this.colorWool = new Wool(wool);
    }

    public String getSpice() {
        return spice.getSpiceAnimal();
    }

    public void setSpice(Spice spice) {
        this.spice = spice;
    }

    // !!!!!!!!!!!!!!!!!!!
    public String getColorWool() {
        return colorWool.getWool();
    }

    public void setColorWool(Wool colorWool) {
        this.colorWool = colorWool;
    }
}


