package by.epam.petropavlovskaya.task3;

import java.util.Random;

class Utility {
    private static final Random random = new Random();

    //  Метод для вывода матрицы в консоль
    static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%.4f  \t", array[i][j]);
            }
            System.out.print("\n");
        }
        /* Нижеприведенную строку можно использовать вместо всего вышеприведенного кода в данной функции,
         * однако форматированный вывод лучше читается.
         */
        // System.out.println(Arrays.deepToString(array));
    }


    //  Метод для инициализации матрицы случайными числами заданного диапазона
    static void initializeArray(double[][] array, double[] limits) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((limits[0] < limits[1])) {
                    array[i][j] = limits[0] + random.nextDouble() * (limits[1] - limits[0]);
                } else {
                    array[i][j] = limits[1] + random.nextDouble() * (limits[0] - limits[1]);
                }
            }
        }
    }


    //  Метод для вывода матрицы в консоль
    static void printMinMax(double[] array) {
        if (array[0] > array[1]) {
            System.out.printf("Максимальный и минимальный элементы данного массива %.4f и %.4f \n", array[0], array[1]);
        } else {
            System.out.printf("Максимальный и минимальный элементы данного массива %.4f и %.4f \n", array[1], array[0]);
        }
    }

    // Метод проверяет значения матрицы на наличие отрицательных или нуля
    static int checkDigit(double[] array) {
        int flag = 1;
        for (double m : array) {
            if (m < 0) {
                System.out.println("Нельзя посчитать среднее геометрическое матрицы, содержащей отрицательное число.");
                flag = -1;
            }
        }
        return flag;
    }

    // Метод проверяет достаточность размерности матрицы для поиска локальных MIN и MAX
    static int checkMatrixSize(double[][] matrix) {
        if (matrix.length < 3) {
            return -1;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length < 3) {
                return -1;
            }
        }
        return 0;
    }

    // Метод проверяет матрицу на "квадратность"
    static boolean checkRightMatrix(double[][] matrix) {
        int mLength = matrix.length;
        if (mLength < 2) {
            return false;
        }
        for (int i = 0; i < mLength; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ( mLength !=  matrix[i].length){
                return false;
                }
            }
        }
        return true;
    }
}