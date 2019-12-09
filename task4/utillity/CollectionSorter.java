package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.*;

public class CollectionSorter {

    // Сортировка по весу
    public static void sortGiftForWeight(List<Sweets> myGift) {
        SweetsWeightComparator myComp = new SweetsWeightComparator();
        myGift.sort(myComp);
    }

    // Сортировка по весу и количеству сахара
    public static void sortGiftForWeightAndSugar(List<Sweets> myGift) {
        Comparator<Sweets> myComp = new SweetsWeightComparator().thenComparing(new SweetsSugarComparator());
        myGift.sort(myComp);
    }
}
