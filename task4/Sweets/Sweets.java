package by.epam.petropavlovskaya.task4.Sweets;

public class Sweets implements Comparable<Sweets>{
    private static int countSweets = 0;
    private String name;           // артикул
    private float weight;       // вес
    private float amountOfSugar; // количество сахара

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public float getAmountOfSugar() {
        return amountOfSugar;
    }

    public static int getCountSweets() {
        return countSweets;
    }

    public Sweets(){}                                                        //udalit
    public Sweets(String name, float weight, float amountOfSugar) {
        this.name = name;
        this.weight = weight;
        this.amountOfSugar = amountOfSugar;
        countSweets++;
    }

    public void createSweet() {
        System.out.println("swits");
    }

    @Override
    public int compareTo(Sweets sw){
        return name.compareTo(sw.getName());
    }

//    @Override
//    public int compareTo(Sweets sw){
//        return (name.compareTo(sw.getName())&& weight.compareTo(sw.getWeight()));
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naimenovanie ");
        sb.append(name);                                // udalit' gettery?
        sb.append(", Ves ");
        sb.append(weight);
        sb.append(", Sugar ");
        sb.append(amountOfSugar);
        return sb.toString();
    }
}
