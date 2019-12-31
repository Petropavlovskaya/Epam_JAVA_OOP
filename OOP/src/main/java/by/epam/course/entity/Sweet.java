package by.epam.course.entity;

import java.util.Objects;

/**
 * Абстрактный супер-класс "Сладость" с общими полями для наследников.
 * Наследники: класс "Шоколадный батончик" {@link ChocolateBar}, класс "Шоколадная конфета" {@link ChocolateCandy} и
 * класс "Леденец" {@link Lollipop}.
 * Имееет поля: <b>countSweets</b> - тип сладости, <b>name</b> - имя, <b>weight</b> - вес,
 * <b>amountOfSugar</b> - количество содержащегося сахара
 */
public abstract class Sweet {
    /**
     * Тип сладости. Имеет ограниченное число вариантов {@link SweetType}
     */
    private SweetType type;

    /**
     * Наименование
     */
    private String name;

    /**
     * Вес. Принимает значения >1
     */
    private float weight;

    /**
     * Количество сахара. Принимает значения >1
     */
    private float amountSugar;

    /**
     * Метод получения значения поля "вес" {@link Sweet#weight}
     *
     * @return - возвращает вес сладости
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Метод получения значения поля "количество сахара" {@link Sweet#amountSugar}
     *
     * @return возвращает количество сахара в сладости
     */
    public float getAmountSugar() {
        return amountSugar;
    }

    /**
     * Конструктор абстрактного суперкласа для инициализации полей наследника
     *
     * @param type        - тип сладости
     * @param name        - наименование
     * @param weight      - вес
     * @param amountSugar - количество сахара
     */
    public Sweet(SweetType type, String name, float weight, float amountSugar) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.amountSugar = amountSugar;
    }

    /**
     * Переопредление метода для вывода полей класса
     *
     * @return возвращает наименование всех полей и их содержимое
     */
    @Override
    public String toString() {
        return type.getName() + " " + name + ";\t" + "Вес: " + weight + ";\t" +
                "Количество сахара: " + amountSugar + ";\t";
    }

    /**
     * Переопредление метода для сравнения экземпляров класса-наследника
     *
     * @return возвращает true если объекты равны, false если нет
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweets = (Sweet) o;
        return Float.compare(sweets.weight, weight) == 0 &&
                Float.compare(sweets.amountSugar, amountSugar) == 0 &&
                name.equals(sweets.name);
    }

    /**
     * Переопредление метода для вычисления хэш-кода экземпляров класса-наследника
     *
     * @return возвращает числовое значение хэш-кода
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, weight, amountSugar);
    }
}
