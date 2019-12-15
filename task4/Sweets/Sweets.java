package by.epam.petropavlovskaya.task4.sweets;

import java.util.Objects;

// Суперкласс "Сладости"
public abstract class Sweets {
    private static int countSweets = 0;     // Счетчик созданных сладостей
    private String name;            // Наименование
    private float weight;           // Вес
    private float amountOfSugar;    // Количество сахара

    public float getWeight() {
        return weight;
    }

    public float getAmountOfSugar() {
        return amountOfSugar;
    }

    public static int getCountSweets() {
        return countSweets;
    }

    // Конструктор Суперкласса
    public Sweets(String name, float weight, float amountOfSugar) {
        this.name = name;
        this.weight = weight;
        this.amountOfSugar = amountOfSugar;
        countSweets++;
    }

    // Переопредление метода для вывода полей на экран.
    @Override
    public String toString() {
        return "Наименование: " + name + ";\t" + "Вес: " + weight + ";\t" +
                "Количество сахара: " + amountOfSugar + ";\t";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return Float.compare(sweets.weight, weight) == 0 &&
                Float.compare(sweets.amountOfSugar, amountOfSugar) == 0 &&
                name.equals(sweets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, amountOfSugar);
    }
}
