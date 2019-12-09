package by.epam.petropavlovskaya.task4.Sweets;

public class ChocolateBar extends Sweets {
    private static int countBars = 0;   // Счетчик созданных шоколадных батончиков
    private ChoсolateBarSize size;      // Размер батончика (перечисление)

    public static int getCountBars() {
        return countBars;
    }

    public ChocolateBar(String name, float weight, float amountOfSugar, ChoсolateBarSize size) {
        super(name, weight, amountOfSugar);
        this.size = size;
        countBars++;
    }

    // Переопредление метода для вывода полей на экран.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Size \t");
        sb.append(size + "\t");
        return sb.toString();
    }
}
