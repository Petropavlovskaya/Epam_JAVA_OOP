package by.epam.petropavlovskaya.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int size = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число больше 0, задающее размерность массива.");
        try {
            size = in.nextInt();
            if (size < 1) {
                throw new RuntimeException();
            }

        } catch (RuntimeException e) {
            System.out.println("Ошибка ввода.");
            System.exit(0);
        }

        double[] myArray = new double[size];

        initializeArray(myArray);
        printArray(myArray);
        System.out.printf("Максимальный по модулю элемент массива: %.4f", findMax(myArray));
        System.out.println();
        System.out.printf("Сумма заданных элементов: %.4f", findSum1(myArray));


    }

    //  Метод для инициализации массива случайными числами заданного диапазона
    private static void initializeArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -50 + (random.nextDouble() * 80);
        }
    }

    // Метод находит максимум
    private static double findMax(double[] array) {
        double max = Math.abs(array[0]);
        for (double d : array) {
            if (Math.abs(d) > max) {
                max = Math.abs(d);
            }
        }
        return max;
    }

    // Метод выводит массив на экран
    private static void printArray(double[] array) {
        for (double d : array) {
            System.out.printf("%.4f \t", d);
        }
        System.out.println();
    }


    // Метод для суммы элементов
    private static double findSum(double[] array) {
        int count = 0;
        double sum = 0;
        for (int d = 1; d < array.length - 1; d++) {
            if (array[d - 1] >= 0 && array[d + 1] >= 0) {
                sum += array[d];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Не найдено значений для суммирования");
            System.exit(0);
        }
        return sum;
    }

    // Метод для суммы элементов
    private static double findSum1(double[] array) {
        int count = 0;
        double sum = 0;
        int min = 0, max = 0;
        for (int d = 0; d < array.length; d++) {
            if (array[d] >= 0) {
                min = d;
                System.out.println("min=" + min);
                break;
            }
        }

        for (int d = min + 1; d < array.length; d++) {
            if (array[d] >= 0) {
                max = d;
                System.out.println("max=" + max);
                break;
            }
        }

        for (int d = min + 1; d < max; d++) {
            sum += array[d];
            count++;
        }

        if (count == 0) {
//            System.out.println("Не найдено значений для суммирования");
//            System.exit(0);
            throw new RuntimeException("sdfsfadf");
        }
        return sum;
    }
}
