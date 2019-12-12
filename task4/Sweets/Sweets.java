package by.epam.petropavlovskaya.task4.Sweets;

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
}
