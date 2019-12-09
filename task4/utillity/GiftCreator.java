package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Factory.SweetsFactory;
import by.epam.petropavlovskaya.task4.Factory.SweetsType;
import by.epam.petropavlovskaya.task4.Sweets.ChocolateBar;
import by.epam.petropavlovskaya.task4.Sweets.ChocolateCandy;
import by.epam.petropavlovskaya.task4.Sweets.Lollipop;
import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Класс для создания детского подарка
public class GiftCreator {

    // Собираем подарок согласно заданному количеству
    public static List<Sweets> collectGift(int count) {
        List<Sweets> myGift = new ArrayList<>();
        Random random = new Random();
        int countCandys = ChocolateCandy.getCountCandys();
        int barsInCollection = ChocolateBar.getCountBars();
        int lollipopsInCollection = Lollipop.getCountLollipops();

        int countInGift = 0;
        while (countInGift < count) {
            SweetsType type = SweetsType.values()[random.nextInt(SweetsType.values().length)];

            // Если все экземпляры подколеекции не превышают заданное число сладостей - добавляем все, иначе рандомно одно.
            switch (type) {
                case CHOCOLATE_CANDY: {
                    if (countInGift + countCandys < count) {
                        myGift.addAll(SweetsFactory.getCandyList());
                        countInGift += countCandys;
                    } else {
                        int tmp = random.nextInt(ChocolateCandy.getCountCandys());
                        myGift.add(SweetsFactory.getCandyList().get(tmp));
                        countInGift++;
                    }
                    break;
                }
                case CHOCOLATE_BAR: {
                    if (countInGift + barsInCollection < count) {
                        myGift.addAll(SweetsFactory.getBarList());
                        countInGift += barsInCollection;
                    } else {
                        int tmp = random.nextInt(ChocolateBar.getCountBars());
                        myGift.add(SweetsFactory.getBarList().get(tmp));
                        countInGift++;
                    }
                    break;
                }
                case LOLLIPOP: {
                    if (countInGift + lollipopsInCollection < count) {
                        myGift.addAll(SweetsFactory.getLollipopList());
                        countInGift += lollipopsInCollection;
                    } else {
                        int tmp = random.nextInt(Lollipop.getCountLollipops());
                        myGift.add(SweetsFactory.getLollipopList().get(tmp));
                        countInGift++;
                    }
                    break;
                }
            }
        }
        return myGift;
    }

}
