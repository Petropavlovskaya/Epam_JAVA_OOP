package by.epam.course.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Класс "Шоколадная конфета" наследуется от класса "Сладость" {@link Sweet}.
 * Имеет собственное поле <b>filling</b> - наличие в конфете начинки и <b>candyList</b> - коллекция шоколадных конфет
 */
public class ChocolateCandy extends Sweet {
    /**
     * Начинка
     */
    private boolean filling;

    /**
     * Коллекция шоколадных конфет
     */
    private static List<ChocolateCandy> candyList = new ArrayList<>();

    /**
     * Метод получения коллекции шоколадных конфет
     *
     * @return - коллекция шоколадных конфет
     */
    public static List<ChocolateCandy> getCandyList() {
        return candyList;
    }

    /**
     * Метод добавления объекта в коллекцию шоколадных конфет
     *
     * @param candy - объект "Шоколадная конфета"
     */
    public static void addToCandyList(ChocolateCandy candy) {
        ChocolateCandy.candyList.add(candy);
    }


    /**
     * Конструктор класа для инициализации полей.
     * Использует конструктор супер-класса {@link Sweet#Sweet(SweetType, String, float, float)}
     *
     * @param type          - тип сладости
     * @param name          - наименование
     * @param weight        - вес
     * @param amountOfSugar - количество сахара
     * @param filling       - наличие в конфете начинки
     */
    public ChocolateCandy(SweetType type, String name, float weight, float amountOfSugar, boolean filling) {
        super(type, name, weight, amountOfSugar);
        this.filling = filling;
    }

    /**
     * Метод для проверки нахождения объекта "Шоколадная конфета" в коллекции шоколадных конфет
     *
     * @param candy - объект "Шоколадная конфета"
     * @return - true при наличии объекта в коллекции, в противном случае - false
     */
    public static boolean containCandy(ChocolateCandy candy) {
        boolean consist = false;
        for (ChocolateCandy oneCandy : candyList) {
            if (oneCandy.hashCode() == candy.hashCode()) {
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
        if (filling) {
            s = "Да";
        }
        return super.toString() + "Наличие начинки: " + s;
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
        ChocolateCandy that = (ChocolateCandy) o;
        return superParamsEquals && (filling == that.filling);
    }

    /**
     * Переопредление метода для вычисления хэш-кода экземпляров класса
     *
     * @return возвращает числовое значение хэш-кода
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), filling);
    }
}
