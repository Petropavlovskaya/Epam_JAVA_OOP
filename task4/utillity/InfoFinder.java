package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class InfoFinder {

    public static List<Sweets> findSweetsBySugar(List<Sweets> gift) {
        List<Sweets> findedSweets = new ArrayList<>();
        int min;
        int max;

        System.out.println("Введите минимальное значение диапазна для поиска по количеству сахара.");
        min = IntegerScanner.getInteger();
        System.out.println("Введите максимальное значение диапазна.");
        max = IntegerScanner.getInteger();

        for (Sweets s : gift) {
            if ((s.getAmountOfSugar() >= min) && (s.getAmountOfSugar() <= max)) {
                findedSweets.add(s);
            }
        }
        return findedSweets;
    }

}
