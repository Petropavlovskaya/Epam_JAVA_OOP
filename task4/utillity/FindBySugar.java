package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class FindBySugar {
    public static List<Sweets> findSweetsBySugar(List<Sweets> gift, float min, float max){
        List<Sweets> findedSweets = new ArrayList<Sweets>();
        for (Sweets s: gift){
            if ((s.getAmountOfSugar() > min) && (s.getAmountOfSugar() < max)){
                findedSweets.add(s);
            }
        }
        return findedSweets;
    }
}
