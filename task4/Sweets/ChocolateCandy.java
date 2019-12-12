package by.epam.petropavlovskaya.task4.Sweets;

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

}
