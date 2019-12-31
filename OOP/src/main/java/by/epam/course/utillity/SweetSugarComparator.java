package by.epam.course.utillity;

import by.epam.course.entity.Sweet;

import java.util.Comparator;

/**
 * Класс "Компоратор" для сортировки по количеству сахара
 *
 * @see CollectionSorter
 */
class SweetSugarComparator implements Comparator<Sweet> {


    /**
     * Переопределенный метод compare для сортировки по количеству сахара
     *
     * @param a - первый объект "Сладость" для сравнения
     * @param b - второй объект "Сладость" для сравнения
     * @return - числовое выражение равенства объектов
     */
    @Override
    public int compare(Sweet a, Sweet b) {
        return Float.compare(a.getAmountSugar(), b.getAmountSugar());
    }
}
