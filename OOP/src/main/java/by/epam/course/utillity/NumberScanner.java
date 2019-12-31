package by.epam.course.utillity;

import java.util.Scanner;

/**
 * Класс "Сканнер" предназначен для сканирования инфрмации, введенной с консоли
 */
public class NumberScanner {

    /**
     * Метод для сканирования введенного с консоли целочисленного значения (от 0 до 2_147_483_647)
     *
     * @return - возвращает считанное значение
     */
    public static int getInteger() {
        int count;
        try {
            Scanner in = new Scanner(System.in);
            count = in.nextInt();
            if (count < 0) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка ввода. Повторите попытку.");
            return getInteger();
        }
        return count;
    }

    /**
     * Метод для сканирования введенного с консоли числа с плавающей запятой (от 0 до 3.4e+38f)
     *
     * @return - возвращает считанное значение
     */
    public static float getFloat() {
        float number;
        try {
            Scanner in = new Scanner(System.in);
            number = in.nextFloat();
            if (number < 0) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка ввода. Повторите попытку.");
            return getFloat();
        }
        return number;
    }

    /**
     * Метод для сканирования двух введенных с консоли чисел с плавающей запятой (от 0 до 3.4e+38f)
     *
     * @return - возвращает считанное значение
     */
    public static float[] getTwoFloat() {
        float[] twoNumber = new float[2];
        System.out.println("Значение 1:");
        twoNumber[0] = NumberScanner.getFloat();
        System.out.println("Значение 2:");
        twoNumber[1] = NumberScanner.getFloat();
        return twoNumber;
    }
}
