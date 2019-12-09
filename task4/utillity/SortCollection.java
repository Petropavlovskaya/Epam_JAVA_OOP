package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollection {

    public static void sortMyCollection(List<Sweets> gift){
//        gift.sort();

        Collections.sort(gift, new Comparator<Sweets>() {
            int compare(Item o1, Item o2) {
                return o1.key.compareTo(o2.key);
            }



    }
}
