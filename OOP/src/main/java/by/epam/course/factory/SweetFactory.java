package by.epam.course.factory;

import by.epam.course.entity.*;

/**
 * Класс "Фабрика". Создает экземпляры классов в зависимости от перечисления {@link SweetType}
 */
public class SweetFactory {

    /**
     * Метод фабрики. Добавляет новые экземпляры сладостей
     *
     * @param stringNumber - номер строки, считанной из файла
     * @param type         - тип сладости {@link SweetType}
     * @param name         - наименование
     * @param weight       - вес
     * @param amountSugar  - количество сахара
     * @param str          - индивидуальный параметр для каддого класса-наследника
     */
    public void createTypeSweets(int stringNumber, SweetType type, String name, float weight,
                                 float amountSugar, String str) {
        switch (type) {
            case CHOCOLATE_CANDY: {
                ChocolateCandy candy = new ChocolateCandy(type, name, weight, amountSugar, Boolean.parseBoolean(str));
                if (ChocolateCandy.containCandy(candy)) {
                    System.out.println("Строка № " + stringNumber + ". Ошибка. Объект " + name + " уже существует.");
                } else {
                    ChocolateCandy.addToCandyList(candy);
                    System.out.println("Строка № " + stringNumber + ". Данные корректны. Создан объект " + name + ".");
                }
                break;
            }
            case CHOCOLATE_BAR: {
                ChocolateBar bar = new ChocolateBar(type, name, weight, amountSugar, BarSize.valueOf(str));
                if (ChocolateBar.containBar(bar)) {
                    System.out.println("Строка № " + stringNumber + ". Ошибка. Объект " + name + " уже существует.");
                } else {
                    ChocolateBar.addToBarList(bar);
                    System.out.println("Строка № " + stringNumber + ". Данные корректны. Создан объект " + name + ".");
                }
                break;
            }
            case LOLLIPOP: {
                Lollipop lollipop = new Lollipop(type, name, weight, amountSugar, Boolean.parseBoolean(str));
                if (Lollipop.containLollipop(lollipop)) {
                    System.out.println("Строка № " + stringNumber + ". Ошибка. Объект " + name + " уже существует.");
                } else {
                    Lollipop.addToLollipopList(lollipop);
                    System.out.println("Строка № " + stringNumber + ". Данные корректны. Создан объект " + name + ".");
                }
                break;
            }
        }
    }

}