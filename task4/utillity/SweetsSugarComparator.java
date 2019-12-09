package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.Comparator;

// sortirovka po saharu
public class SweetsSugarComparator implements Comparator<Sweets> {

    public int compare(Sweets a, Sweets b) {
        if (a.getAmountOfSugar() > b.getAmountOfSugar())
            return 1;
        else if (a.getAmountOfSugar() < b.getAmountOfSugar())
            return -1;
        else
            return 0;
    }
}
