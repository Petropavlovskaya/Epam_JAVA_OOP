package by.epam.course.run;


/*      Задание 6. Новогодний подарок.
        Определить иерархию конфет и прочих сладостей.
        1. Создать несколько объектов-конфет.
        2. Собрать детский подарок с определением его веса.
        3. Провести сортировку конфет в подарке на основе одного и нескольких параметров.
        4. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
*/

import by.epam.course.entity.*;
import by.epam.course.factory.GiftCreator;
import by.epam.course.utillity.*;

import java.util.List;

/**
 * @author Петропавловская Олеся Анатольевна
 * Основной класс, запускающий программу
 */
public class Main {
    public static void main(String[] args) {

        List<Sweet> myGift;
        float[] twoNumber;

        // 1. Читаем из файла и создаем коллекции сладостей
        System.out.println("Читаем данные из файла:");
        TxtToFactory.createNewSweets();
        InfoPrinter.printCountsSweets();
        System.out.println();


        System.out.println(ChocolateBar.getBarList().toString());
        System.out.println(ChocolateCandy.getCandyList().toString());
        System.out.println(Lollipop.getLollipopList().toString());
        System.out.println();

        // 2. Собираем детский подарок
        System.out.println("Введите количество сладостей для подарка.");
        myGift = GiftCreator.collectGift(NumberScanner.getInteger());
        System.out.println();

        // Выводим на печать собранный подарок
        System.out.println("Наш подарок состоит из следующих сладостей:");
        InfoPrinter.printSweetsCollection(myGift);
        System.out.println();

        // Печатаем вес собранного подарка
        InfoPrinter.printGiftWeight(myGift);
        System.out.println();

        // 3. Сортируем подарок по весу
        CollectionSorter.sortGiftForWeight(myGift);

        // Выводм на печать подарок, отсортированный по весу
        System.out.println("Подарок, отсортированный по весу:");
        InfoPrinter.printSweetsCollection(myGift);

        // 3. Сортируем подарок по весу и количеству сахара
        CollectionSorter.sortGiftForWeightAndSugar(myGift);
        System.out.println();

        // Выводм на печать подарок, отсортированный по весу и количеству сахара
        System.out.println("Подарок, отсортированный по весу и количеству сахара:");
        InfoPrinter.printSweetsCollection(myGift);
        System.out.println();

        // 4. Находим в подарке сладости, соответствующие заданному диапазону
        System.out.println("Введите диапазон для поиска по количеству сахара.");
        twoNumber = NumberScanner.getTwoFloat();
        InfoPrinter.printSweetsCollection(InfoFinder.findSweetsBySugar(myGift, twoNumber));

    }
}
