package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.sweets.Sweets;

import java.util.Comparator;

//Сортировка по сахару
public class SweetsSugarComparator implements Comparator<Sweets> {

    public int compare(Sweets a, Sweets b) {
        return Float.compare(a.getAmountOfSugar(), b.getAmountOfSugar());
    }
}
