package by.epam.petropavlovskaya.task4.sweets;

import java.util.Objects;

public class Lollipop extends Sweets {
    private static int countLollipops = 0;  // Счетчик созданных леденцов
    private boolean stick;               // Наличие палочки у леденца

    public static int getCountLollipops() {
        return countLollipops;
    }

    public Lollipop(String name, float weight, float amountOfSugar, boolean stick) {
        super(name, weight, amountOfSugar);
        this.stick = stick;
        countLollipops++;
    }

    // Переопредление метода для вывода полей на экран.
    @Override
    public String toString() {
        return super.toString() + "Наличие палочки: " + stick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lollipop lollipop = (Lollipop) o;
        return stick == lollipop.stick;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stick);
    }
}
