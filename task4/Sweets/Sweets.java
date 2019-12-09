package by.epam.petropavlovskaya.task4.Sweets;

// Суперкласс "Сладости"
public class Sweets {
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
        String sb;
        sb = "Naimenovanie: " + name + ";\t" + "Ves: " + weight + ";\t" + "Sugar: " + amountOfSugar + ";\t";
        return sb;


/*        StringBuilder sb = new StringBuilder();
        sb.append("Naimenovanie: ");
        sb.append(name + ";\t");
        sb.append("Ves: ");
        sb.append(weight + ";\t");
        sb.append("Sugar: ");
        sb.append(amountOfSugar + ";\t");
        return sb.toString();*/
    }
}
