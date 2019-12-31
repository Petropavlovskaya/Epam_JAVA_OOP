package by.epam.course.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Класс "Леденец" наследуется от класса "Сладость" {@link Sweet}.
 * Имеет собственное поле <b>stick</b> - наличие у леденца палочки и <b>lollipopList</b> - коллекция леденцов
 */
public class Lollipop extends Sweet {
    /**
     * Палочка
     */
    private boolean stick;

    /**
     * Коллекция леденцов
     */
    private static List<Lollipop> lollipopList = new ArrayList<>();

    /**
     * Метод получения коллекции леденцов
     *
     * @return - коллекция леденцов
     */
    public static List<Lollipop> getLollipopList() {
        return lollipopList;
    }

    /**
     * Метод добавления объекта в коллекцию леденцов
     *
     * @param lollipop - объект "Леденец"
     */
    public static void addToLollipopList(Lollipop lollipop) {
        Lollipop.lollipopList.add(lollipop);
    }


    /**
     * Конструктор класа-наследника для инициализации полей.
     * Использует конструктор супер-класса {@link Sweet#Sweet(SweetType, String, float, float)}
     *
     * @param type          - тип сладости
     * @param name          - наименование
     * @param weight        - вес
     * @param amountOfSugar - количество сахара
     * @param stick         - наличие у леденца палочки
     */
    public Lollipop(SweetType type, String name, float weight, float amountOfSugar, boolean stick) {
        super(type, name, weight, amountOfSugar);
        this.stick = stick;
    }

    /**
     * Метод для проверки нахождения объекта "Леденец" в коллекции леденцов
     *
     * @param lollipop - объект "Леденец"
     * @return - true при наличии объекта в коллекции, в противном случае - false
     */
    public static boolean containLollipop(Lollipop lollipop) {
        boolean consist = false;
        for (Lollipop oneLollipop : lollipopList) {
            if (oneLollipop.hashCode() == lollipop.hashCode()) {
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
        String s = "Нет";
        if (stick) {
            s = "Да";
        }
        return super.toString() + "Наличие палочки: " + s;
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
        Lollipop lollipop = (Lollipop) o;
        return superParamsEquals && (stick == lollipop.stick);
    }

    /**
     * Переопредление метода для вычисления хэш-кода экземпляров класса
     *
     * @return возвращает числовое значение хэш-кода
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stick);
    }
}
