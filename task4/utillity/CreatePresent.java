package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Factory.SweetsFactory;
import by.epam.petropavlovskaya.task4.Factory.SweetsType;
import by.epam.petropavlovskaya.task4.Sweets.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Класс для создания детского подарка
public class CreatePresent {

    // Запрашиваем количество конфет в подарок
    public static int createGift() {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество сладостей для подарка. Максимальная упаковка - 100 шт.");

        try {
            count = in.nextInt();
            if (count > 100) {
                System.out.println("У нас нет упаковки для такого большого подарка!");
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка ввода.");
        }
        return count;
    }

    // sobirajem nuzhnoje kolichesvo iz vseh vidov
    public static List<Sweets> collectGift(int count) {
        List<Sweets> myGift = new ArrayList<Sweets>();

        Random random = new Random();
        int candysInCollection = ChocolateCandy.getCountCandys();
        int barsInCollection = ChocolateBar.getCountBars();
        int lollipopsInCollection = Lollipop.getCountLollipops();

        int countInGift = 0;
        for (int i = 0; countInGift < count; i++) {
            SweetsType type = SweetsType.values()[random.nextInt(SweetsType.values().length)];
            switch (type) {
                case CHOCOLATE_CANDY: {
                    if (countInGift + candysInCollection < count) {
                        myGift.addAll(SweetsFactory.getCandyList());
                        countInGift += candysInCollection;
                        System.out.println("add all in Candy, countGift = " + countInGift);
                    } else {
                        int tmp = random.nextInt(ChocolateCandy.getCountCandys());
                        myGift.add(SweetsFactory.getCandyList().get(tmp));
                        countInGift++;
                        System.out.println("add one in Candy, countGift = " + countInGift);
                    }
                    break;
                }
                case CHOCOLATE_BAR: {
                    if (countInGift + barsInCollection < count) {
                        myGift.addAll(SweetsFactory.getBarList());
                        countInGift += barsInCollection;
                        System.out.println("add all in Bar, countGift = " + countInGift);
                    } else {
                        int tmp = random.nextInt(ChocolateBar.getCountBars());
                        myGift.add(SweetsFactory.getBarList().get(tmp));
                        countInGift++;
                        System.out.println("add one in Bar, countGift = " + countInGift);
                    }
                    break;
                }
                case LOLLIPOP: {
                    if (countInGift + lollipopsInCollection < count) {
                        myGift.addAll(SweetsFactory.getLollipopList());
                        countInGift += lollipopsInCollection;
                        System.out.println("add all in Lol, countGift = " + countInGift);
                    } else {
                        int tmp = random.nextInt(Lollipop.getCountLollipops());
                        myGift.add(SweetsFactory.getLollipopList().get(tmp));
                        countInGift++;
                        System.out.println("add one in Lol, countGift = " + countInGift);
                    }
                    break;
                }
            }

        }

        float weight = 0;
        System.out.println("V nashem podarke:");
        for (Sweets s : myGift) {
            weight += s.getWeight();
            System.out.println(s);
        }
        System.out.println("Общий вес собранного подарка: " + weight + " грамм.");

        return myGift;
    }

}
