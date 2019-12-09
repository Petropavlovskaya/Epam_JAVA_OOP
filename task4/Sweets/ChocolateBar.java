package by.epam.petropavlovskaya.task4.Sweets;

public class ChocolateBar extends Sweets {
    private static int countBars = 0;   // Счетчик созданных шоколадных батончиков
    private String size;      // Размер батончика

    public static int getCountBars() {
        return countBars;
    }

    public ChocolateBar(String name, float weight, float amountOfSugar, String size) {
        super(name, weight, amountOfSugar);
        this.size = size;
        countBars++;
    }

    // Переопредление метода для вывода полей на экран.
    @Override
    public String toString() {
        String sb;
        sb = super.toString() + "Size: " + size;
        return sb;
    }
}
