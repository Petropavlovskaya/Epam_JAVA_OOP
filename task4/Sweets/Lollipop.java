package by.epam.petropavlovskaya.task4.Sweets;

public class Lollipop extends Sweets {
    private static int countLollipops = 0;  // Счетчик созданных лединцов
    private boolean stick;               // Наличие палочки у лединца

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
}
