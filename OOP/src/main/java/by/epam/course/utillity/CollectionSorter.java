package by.epam.course.utillity;

import by.epam.course.entity.Sweet;

import java.util.Comparator;
import java.util.List;

/**
 * Класс "Сортировка коллекции"
 */
public class CollectionSorter {

    /**
     * Метод сортировки по весу.
     * Принимает коллекцию Сладостей {@link Sweet}
     *
     * @param myGift - Коллекция сладостй
     * @see SweetWeightComparator
     */
    public static void sortGiftForWeight(List<Sweet> myGift) {
        SweetWeightComparator myComp = new SweetWeightComparator();
        myGift.sort(myComp);
    }

    /**
     * Метод сортировки по весу и затем по количеству сахара.
     * Принимает коллекцию Сладостей {@link Sweet}
     *
     * @param myGift - Коллекция сладостй
     * @see SweetWeightComparator
     * @see SweetSugarComparator
     */
    public static void sortGiftForWeightAndSugar(List<Sweet> myGift) {
        Comparator<Sweet> myComp = new SweetWeightComparator().thenComparing(new SweetSugarComparator());
        myGift.sort(myComp);
    }
}
