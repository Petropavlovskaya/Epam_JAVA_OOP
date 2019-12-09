package by.epam.petropavlovskaya.task4.Sweets;

import java.util.ArrayList;
import java.util.List;

public class ChocolateCandy extends Sweets {
    private static int countCandys = 0;
    private boolean hasFilling;         // содержит начинку

    public static int getCountCandys() {
        return countCandys;
    }


    public ChocolateCandy(String name, float weight, float amountOfSugar, boolean hasFilling) {
        super(name, weight,amountOfSugar);
        this.hasFilling = hasFilling;
        countCandys++;
    }

    @Override
    public void createSweet() {
        System.out.println("Choc candy");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Filling ");
        sb.append(hasFilling);
        return sb.toString();
    }

}
