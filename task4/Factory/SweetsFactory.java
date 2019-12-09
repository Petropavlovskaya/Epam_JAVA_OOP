package by.epam.petropavlovskaya.task4.Factory;

import by.epam.petropavlovskaya.task4.Sweets.*;

import java.util.ArrayList;
import java.util.List;

public class SweetsFactory {
    private static List<ChocolateCandy> candyList = new ArrayList<ChocolateCandy>();
    private static List<ChocolateBar> barList = new ArrayList<ChocolateBar>();
    private static List<Lollipop> lollipopList = new ArrayList<Lollipop>();


    public static List<ChocolateCandy> getCandyList() {
        return candyList;
    }

    public static List<ChocolateBar> getBarList() {
        return barList;
    }

    public static List<Lollipop> getLollipopList() {
        return lollipopList;
    }

    public void createTypeSweets(SweetsType type, String name, float weight, float amountOfSugar, String str) {

        switch (type) {
            case CHOCOLATE_CANDY: {
                candyList.add(new ChocolateCandy(name, weight, amountOfSugar, Boolean.parseBoolean(str)));
                break;
            }
            case CHOCOLATE_BAR: {
                barList.add(new ChocolateBar(name, weight, amountOfSugar, ChokolateBarSize.valueOf(str)));
                break;
            }
            case LOLLIPOP: {
                lollipopList.add(new Lollipop(name, weight, amountOfSugar, Boolean.parseBoolean(str)));
                break;
            }
        }
    }
}