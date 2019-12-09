package by.epam.petropavlovskaya.task4.Sweets;

public class Lollipop extends Sweets {
    private static int countLollipops = 0;  // Счетчик созданных лединцов
    private boolean hasStick;               // Наличие палочки у лединца

    public static int getCountLollipops() {
        return countLollipops;
    }

    public Lollipop(String name, float weight, float amountOfSugar, boolean hasStick) {
        super(name, weight, amountOfSugar);
        this.hasStick = hasStick;
        countLollipops++;
    }

    // Переопредление метода для вывода полей на экран.
    @Override
    public String toString() {
        String sb;
        sb = super.toString() + "Stick: " + hasStick;
        return sb;


/*        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Stick: ");
        sb.append(hasStick + ";\t");
        return sb.toString();*/
    }
}
