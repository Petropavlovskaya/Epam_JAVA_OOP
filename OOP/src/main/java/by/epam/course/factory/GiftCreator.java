package by.epam.course.factory;

import by.epam.course.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Класс для создания детского подарка.
 */
public class GiftCreator {

    /**
     * Метод для создания детского подарка. Добавляет в подарок случайные сладости
     *
     * @param count - количество сладостей в подарке
     * @return Возвращает коллекцию сладостей
     */
    public static List<Sweet> collectGift(int count) {
        // Переменная для коллекции "Подарок"
        List<Sweet> myGift = new ArrayList<>();
        Random random = new Random();

        // Переменная для количества сладостей, добавленных в подарок
        int countInGift = 0;

        while (countInGift < count) {
            // Переменная для случайного типа сладости
            SweetType type = SweetType.values()[random.nextInt(SweetType.values().length)];
            switch (type) {

                case CHOCOLATE_CANDY: {
                    // Переменная для случайной конфеты из коллекции конфет
                    int candyIndex = random.nextInt(ChocolateCandy.getCandyList().size());
                    myGift.add(ChocolateCandy.getCandyList().get(candyIndex));
                    countInGift++;
                    break;
                }
                case CHOCOLATE_BAR: {
                    // Переменная для случайного шоколадного батончика из коллекции шоколадных батончиков
                    int barIndex = random.nextInt(ChocolateBar.getBarList().size());
                    myGift.add(ChocolateBar.getBarList().get(barIndex));
                    countInGift++;
                    break;
                }
                case LOLLIPOP: {
                    // Переменная для случайного леденеца из коллекции леденцов
                    int lollipopIndex = random.nextInt(Lollipop.getLollipopList().size());
                    myGift.add(Lollipop.getLollipopList().get(lollipopIndex));
                    countInGift++;
                    break;
                }
            }
        }
        return myGift;
    }

}
