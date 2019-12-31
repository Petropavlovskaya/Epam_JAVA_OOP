package by.epam.course.entity;

/**
 * Класс-перечислениее. Содержит перечень всех типов сладостей, заложенных в программу
 */
public enum SweetType {
    CHOCOLATE_CANDY("Шоколадная конфета"),
    LOLLIPOP("Леденец"),
    CHOCOLATE_BAR("Шоколадный батончик");

    /**
     * Имя
     */
    private String name;

    /**
     * Конструктор перечисления
     *
     * @param name - имя
     */
    SweetType(String name) {
        this.name = name;
    }

    /**
     * Метод получения имени перечисления
     *
     * @return - имя перечисления
     */
    public String getName() {
        return name;
    }
}