package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.ChocolateBar;
import by.epam.petropavlovskaya.task4.Sweets.ChocolateCandy;
import by.epam.petropavlovskaya.task4.Sweets.Lollipop;
import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.List;

public class InfoPrinter {

    // Печатает количество сладостей, загруженное из файла
    public static void printCountsSweets() {
        System.out.println("В наших коллекциях " + Sweets.getCountSweets() + " сладостей. \nИз них: " +
                ChocolateBar.getCountBars() + " шоколадных батончиков " + Lollipop.getCountLollipops() +
                " леденцов и " + ChocolateCandy.getCountCandys() + " конфет.");
    }

    // Печатает все сладости из всех коллекций
    public static void printSweetsCollection(List<Sweets> sweets) {
        if (sweets.isEmpty()) {
            System.out.println("Пусто!");
        } else {
            for (Sweets s : sweets) {
                System.out.println(s.toString());
            }
        }
    }

    // Печатает вес собранного подарка
    public static void printGiftWeight(List<Sweets> myGift) {
        float weight = 0;
        for (Sweets s : myGift) {
            weight += s.getWeight();
        }
        System.out.println("Общий вес собранного подарка: " + weight + " грамм.");
    }


}
