package by.aston.java.base.home_work._3_home_work.task_1;

import by.aston.java.base.home_work._3_home_work.task_1.inner_class.Spice;
import by.aston.java.base.home_work._3_home_work.task_1.inner_class.Wool;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(getClass() !=o.getClass()) return false;
        if (!super.equals(o)) return false;

        Mammals mammals = (Mammals) o;
        return Objects.equals(spice, mammals.spice) && Objects.equals(colorWool, mammals.colorWool);

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), spice, colorWool);
    }
}
