package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class InfoFinder {

    public static List<Sweets> findSweetsBySugar(List<Sweets> gift) {
        List<Sweets> findedSweets = new ArrayList<>();
        int min;
        int max;
        int tmp;    // Промежуточная переменная для правильного распределения min-max

        System.out.println("Значение 1:");
        min = IntegerScanner.getInteger();
        System.out.println("Значение 2:");
        tmp = IntegerScanner.getInteger();
        if (tmp < min) {
            max = min;
            min = tmp;
        } else {
            max = tmp;
        }

        for (Sweets s : gift) {
            if ((s.getAmountOfSugar() >= min) && (s.getAmountOfSugar() <= max)) {
                findedSweets.add(s);
            }
        }
        return findedSweets;
    }

}
