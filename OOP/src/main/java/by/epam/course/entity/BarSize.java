package by.epam.course.entity;

/**
 * Класс-перечислениее "Размер шоколадного батончика" для класса "Шоколадный батончик" {@link ChocolateBar}.
 * Содержит перечень всех размеров шоколадных батончиков, заложенных в программу
 */
public enum BarSize {
    SMALL("Маленький"),
    MEDIUM("Средний"),
    LARGE("Большой"),
    EXTRA_LARGE("Очень большой");

    /**
     * Имя
     */
    private String name;

    /**
     * Конструктор перечисления
     *
     * @param name - имя
     */
    BarSize(String name) {
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
