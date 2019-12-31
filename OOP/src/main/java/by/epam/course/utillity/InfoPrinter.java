package by.epam.course.utillity;

import by.epam.course.entity.*;

import java.util.List;

/**
 * Класс "Печать информации".
 * Предназначен для вывода на консоль запрашиваемой информаци
 */
public class InfoPrinter {

    /**
     * Метод печатает количество сладостей, загруженных из файла
     */
    public static void printCountsSweets() {
        System.out.println("В наших коллекциях " + ChocolateBar.getBarList().size() + " шоколадных батончиков, " +
                Lollipop.getLollipopList().size() + " леденцов и " + ChocolateCandy.getCandyList().size() + " конфет.");
    }

    /**
     * Метод печатает все сладости (наименование и содержание полей) из коллекции
     *
     * @param sweets - коллекция сладостей
     */
    public static void printSweetsCollection(List<Sweet> sweets) {
        if (sweets.isEmpty()) {
            System.out.println("Пусто!");
        } else {
            for (Sweet s : sweets) {
                System.out.println(s.toString());
            }
        }
    }

    /**
     * Метод печатает общий вес собранного подарка
     *
     * @param myGift - собранный подарок
     */
    public static void printGiftWeight(List<Sweet> myGift) {
        float weight = InfoFinder.countGiftWeight(myGift);
        System.out.printf("Общий вес собранного подарка: %.1f грамм.", weight);
    }
}
