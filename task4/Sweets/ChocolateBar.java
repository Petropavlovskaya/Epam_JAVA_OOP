package by.epam.petropavlovskaya.task4.Sweets;

public class ChocolateBar extends Sweets {
    private ChokolateBarSize size;      // размер батончика
    private static int countBars = 0;

    public static int getCountBars() {
        return countBars;
    }

    public ChocolateBar(){

    }

    public ChocolateBar(String name, float weight, float amountOfSugar, ChokolateBarSize size) {
        super(name, weight,amountOfSugar);
        this.size = size;
        countBars++;
    }

    @Override
    public void createSweet() {
        System.out.println("Choc bar");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Size ");
        sb.append(size);
        return sb.toString();
    }
}
