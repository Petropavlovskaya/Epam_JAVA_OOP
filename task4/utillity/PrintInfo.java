package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Factory.SweetsFactory;
import by.epam.petropavlovskaya.task4.Sweets.ChocolateBar;
import by.epam.petropavlovskaya.task4.Sweets.ChocolateCandy;
import by.epam.petropavlovskaya.task4.Sweets.Lollipop;
import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.List;

public class PrintInfo {

    public static void printCountsSweets() {
        System.out.println("We have " + Sweets.getCountSweets() + " sweets. There are " + ChocolateBar.getCountBars() + " Bars " +
                Lollipop.getCountLollipops() + " Lollipops & " + ChocolateCandy.getCountCandys() + " Candys");
    }

    public static void printAllCollections() {
        List<ChocolateCandy> listCandy = SweetsFactory.getCandyList();
        for (ChocolateCandy s : listCandy) {
            System.out.println(s.toString());
        }
        List<ChocolateBar> listBar = SweetsFactory.getBarList();
        for (ChocolateBar b : listBar) {
            System.out.println(b.toString());
        }

        List<Lollipop> listLol = SweetsFactory.getLollipopList();
        for (Lollipop lol : listLol) {
            System.out.println(lol.toString());
        }
    }

    public static void printSweetsCollection(List<Sweets> sweets) {
        for (Sweets s : sweets) {
            System.out.println(s.toString());
        }
    }


}
