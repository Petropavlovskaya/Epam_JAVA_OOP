package by.epam.petropavlovskaya.task4.sweets;

import java.util.Objects;

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
        return super.toString() + "Размер: " + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChocolateBar that = (ChocolateBar) o;
        return Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
