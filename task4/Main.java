package by.epam.petropavlovskaya.task4;

import by.epam.petropavlovskaya.task4.sweets.Sweets;
import by.epam.petropavlovskaya.task4.utillity.*;

import java.util.List;

/*      Задание 6. Новогодний подарок.
        Определить иерархию конфет и прочих сладостей.
        1. Создать несколько объектов-конфет.
        2. Собрать детский подарок с определением его веса.
        3. Провести сортировку конфет в подарке на основе одного и нескольких параметров.
        4. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
*/

public class Main {
    public static void main(String[] args) {

        List<Sweets> myGift;

        // 1. Читаем из файла и создаем коллекции сладостей
        TxtForFactoryReader.createNewSweets();
        InfoPrinter.printCountsSweets();

        // 2. Собираем детский подарок
        System.out.println("Введите количество сладостей для подарка.");
        myGift = GiftCreator.collectGift(IntegerScanner.getInteger());

        // Выводим на печать собранный подарок
        System.out.println("Наш подарок состоит из следующих сладостей:");
        InfoPrinter.printSweetsCollection(myGift);

        // Печатаем вес собранного подарка
        InfoPrinter.printGiftWeight(myGift);

        // 3. Сортируем подарок по весу
        CollectionSorter.sortGiftForWeight(myGift);

        // Выводм на печать подарок, отсортированный по весу
        System.out.println("Подарок, отсортированный по весу:");
        InfoPrinter.printSweetsCollection(myGift);

        // 3. Сортируем подарок по весу и количеству сахара
        CollectionSorter.sortGiftForWeightAndSugar(myGift);

        // Выводм на печать подарок, отсортированный по весу и количеству сахара
        System.out.println("Подарок, отсортированный по весу и количеству сахара:");
        InfoPrinter.printSweetsCollection(myGift);

        // 4. Находим в подарке сладости, соответствующие заданному диапазону
        System.out.println("Введите диапазон для поиска по количеству сахара.");
        InfoPrinter.printSweetsCollection(InfoFinder.findSweetsBySugar(myGift));

    }
}
