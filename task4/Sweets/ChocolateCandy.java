package by.epam.petropavlovskaya.task4.Sweets;

public class ChocolateCandy extends Sweets {
    private static int countCandys = 0; // Счетчик созданных шоколадных конфет
    private boolean hasFilling;         // Наличие в конфете начинки

    public static int getCountCandys() {
        return countCandys;
    }

    public ChocolateCandy(String name, float weight, float amountOfSugar, boolean hasFilling) {
        super(name, weight, amountOfSugar);
        this.hasFilling = hasFilling;
        countCandys++;
    }

    // Переопредление метода для вывода полей на экран.
    @Override
    public String toString() {

        String sb;
        sb = super.toString() + "Filling: " + hasFilling;
        return sb;
    }

}
