package by.epam.petropavlovskaya.task4.sweets;

import java.util.Objects;

public class ChocolateCandy extends Sweets {
    private static int countCandys = 0; // Счетчик созданных шоколадных конфет
    private boolean filling;         // Наличие в конфете начинки

    public static int getCountCandys() {
        return countCandys;
    }

    public ChocolateCandy(String name, float weight, float amountOfSugar, boolean filling) {
        super(name, weight, amountOfSugar);
        this.filling = filling;
        countCandys++;
    }

    // Переопредление метода для вывода полей на экран.
    @Override
    public String toString() {
        return super.toString() + "Наличие начинки: " + filling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChocolateCandy that = (ChocolateCandy) o;
        return filling == that.filling;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), filling);
    }
}
