package by.epam.course.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Класс "Шоколадный батончик" наследуется от класса "Сладость" {@link Sweet}.
 * Имеет собственное поле <b>size</b> - размер батончика и <b>barList</b> - коллекция созданных шоколадных батончиков
 */
public class ChocolateBar extends Sweet {
    /**
     * Размер. Имеет ограниченное число вариантов {@link BarSize}
     */
    private BarSize size;

    /**
     * Коллекция шоколадных батончиков
     */
    private static List<ChocolateBar> barList = new ArrayList<>();

    /**
     * Метод получения коллекции шоколадных батончиков
     *
     * @return - коллекция шоколадных батончиков
     */
    public static List<ChocolateBar> getBarList() {
        return barList;
    }

    /**
     * Метод добавления объекта в коллекцию шоколадных батончиков
     *
     * @param bar - объект "Шоколадный батончик"
     */
    public static void addToBarList(ChocolateBar bar) {
        ChocolateBar.barList.add(bar);
    }


    /**
     * Конструктор класа для инициализации полей.
     * Использует конструктор супер-класса {@link Sweet#Sweet(SweetType, String, float, float)}
     *
     * @param type          - тип сладости
     * @param name          - наименование
     * @param weight        - вес
     * @param amountOfSugar - количество сахара
     * @param size          - размер батончика
     */
    public ChocolateBar(SweetType type, String name, float weight, float amountOfSugar, BarSize size) {
        super(type, name, weight, amountOfSugar);
        this.size = size;
    }

    /**
     * Метод для проверки нахождения объекта "Шоколадный батончик" в коллекции шоколадных батончиков
     *
     * @param bar - объект "Шоколадный батончик"
     * @return - true при наличии объекта в коллекции, в противном случае - false
     */
    public static boolean containBar(ChocolateBar bar) {
        boolean consist = false;
        for (ChocolateBar oneBar : barList) {
            if (oneBar.hashCode() == bar.hashCode()) {
                consist = true;
            }
        }
        return consist;
    }

    /**
     * Переопредление метода для вывода полей класса
     *
     * @return возвращает наименование всех полей и их содержимое
     */
    @Override
    public String toString() {
        return super.toString() + "Размер: " + size.getName();
    }

    /**
     * Переопредление метода для сравнения экземпляров класса
     *
     * @return возвращает true если объекты равны, false если нет
     */
    @Override
    public boolean equals(Object o) {
        boolean superParamsEquals;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        superParamsEquals = super.equals(o);
        ChocolateBar that = (ChocolateBar) o;
        return superParamsEquals && Objects.equals(size, that.size);
    }

    /**
     * Переопредление метода для вычисления хэш-кода экземпляров класса
     *
     * @return возвращает числовое значение хэш-кода
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
