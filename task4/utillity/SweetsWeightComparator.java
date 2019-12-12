package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.Comparator;

// Сортировка по весу
public class SweetsWeightComparator implements Comparator<Sweets> {
    public int compare(Sweets a, Sweets b) {
        return Float.compare(a.getWeight(), b.getWeight());
    }

}