package by.epam.petropavlovskaya.task4.Sweets;

import java.util.ArrayList;
import java.util.List;

public class Lollipop extends Sweets {
    private boolean hasStick;           // на палочке
    private static int countLollipops = 0;

    public static int getCountLollipops() {
        return countLollipops;
    }

    public Lollipop(){}                                                                     // udalit

    public Lollipop(String name, float weight, float amountOfSugar, boolean hasStick) {
        super(name, weight, amountOfSugar);
        this.hasStick = hasStick;
        countLollipops++;
    }

    @Override
    public void createSweet() {
        System.out.println("Lill");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Stick ");
        sb.append(hasStick);
        return sb.toString();
    }
}
