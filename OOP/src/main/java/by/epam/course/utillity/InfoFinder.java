package by.epam.course.utillity;

import by.epam.course.entity.Sweet;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс "Поиск информации"
 */
public class InfoFinder {

    /**
     * Метод для поиска в коллекции сладостей по заданному диапазону содержания сахара.
     *
     * @param gift      - собранный подарок
     * @param twoNumber - массив, содержащий начальное и конечное значения для поиска
     * @return - возвращает коллекцию сладостей, содержащих сахар согласно заданному диапазону
     */
    public static List<Sweet> findSweetsBySugar(List<Sweet> gift, float[] twoNumber) {
        List<Sweet> sweet = new ArrayList<>();                  // Возвращаемое поле (коллекция отобранных сладостей)
        float min = Math.min(twoNumber[0], twoNumber[1]);       // Поле минимальное значение диапазона для поиска
        float max = Math.max(twoNumber[0], twoNumber[1]);       // Поле максимальное значение диапазона для поиска

        // Перебираем подарок и записываем отобранные объекты в коллекцию
        for (Sweet s : gift) {
            if ((s.getAmountSugar() >= min) && (s.getAmountSugar() <= max)) {
                sweet.add(s);
            }
        }
        return sweet;
    }

    /**
     * Рассичтываем общий вес собранной коллекции
     *
     * @param myGift - собранная коллекция
     * @return - вес собранной коллекции
     */
    public static float countGiftWeight(List<Sweet> myGift) {
        float weight = 0;
        for (Sweet s : myGift) {
            weight += s.getWeight();
        }
        return weight;
    }
}
