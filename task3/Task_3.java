package by.epam.petropavlovskaya.task3;

public class Task_3 {


    public static void main(String[] args) {

        /* Задана матрица размера N x M. Необходимо выполнить следующие действия:
         *
         * 1. найти экстремальные значения (минимальный и максимальный элементы) данной матрицы;
         * 2. найти среднеарифметическое и среднегеометрическое значения всех элементов матрицы;
         * 3. найти позицию первого встретившегося локального минимума (максимума),
         *    а если таких элементов нет, то возвратить -1 (локальный минимум это элемент,
         *    который меньше любого из своих соседей; локальный максимум – это элемент,
         *    который больше любого из своих соседей);
         * 4. транспонировать матрицу (при решении данного задания не рекомендуется задействовать
         *    дополнительную память).
         */

        double[][] temp1 = new double[6][6];                                // Размер матрицы используется для п. 1-3
        double[] minMax;                                                    // Используется в п. 1 и п. 2.2.

        Utility.initializeArray(temp1, GetInputData.getInput());            // Инициализация матрицы
        System.out.println("Мы получили следующий многомерный массив:");
        Utility.printArray(temp1);                                          // Вывод проинициализированной матрицы

        // 1. Максимальный и минимальный элементы матрицы
        minMax = findMinMax(temp1);
        Utility.printMinMax(minMax);

        // 2.1. Среднеарифметическое значение
        System.out.printf("Среднее арифметическое матрицы: %.4f \n", findAverageArith(temp1));

        // 2.2. Среднегеометрическое значение
        if (Utility.checkDigit(minMax) == 1) {
            System.out.printf("Среднее геометрическое матрицы:  %.4f \n", findAverageGeom(temp1, minMax));
        }

        // 3. Позиция первого встретившегося локального минимума (максимума)
        if (Utility.checkMatrixSize(temp1) == -1) {
            System.out.println("Недостаточная размерность матрицы для вычисления локального минимума и максимума");
        } else {
            if (findLocalMin(temp1) == -1) {
                System.out.println("Локальный минимум: -1");
                //System.out.printf("Локальный максимум: %.4f", findLocalMax(temp1));
            }
            if (findLocalMax(temp1) == -1) {
                System.out.println("Локальный максимум: -1");
            }
        }

/*        // Блок для тестирования матриц из класса Test_Matrix
        Utility.printArray(Test_Matrix.testMinMax2);
        if (Utility.checkMatrixSize(Test_Matrix.testMinMax1) == -1) {
            System.out.println("Недостаточная размерность матрицы для вычисления локального минимума и максимума");
        } else {
            if (findLocalMin(Test_Matrix.testMinMax2) == -1) {
                System.out.println("Локальный минимум: -1");
                //System.out.printf("Локальный максимум: %.4f", findLocalMax(temp1));
            }
            if (findLocalMax(Test_Matrix.testMinMax2) == -1) {
                System.out.println("Локальный максимум: -1");
            }
        }
*/


        if (Utility.checkRightMatrix(temp1)) {
            //System.out.println("Matrix before transpose:");
            //Utility.printArray(temp1);
            System.out.println("Матрица после транспонирования:");
            Utility.printArray(doTranspose(temp1));
        } else {
            System.out.println("Данную матрицу невозможно транспонировать реализованным методом.");
        }

    }


    //1. найти экстремальные значения (минимальный и максимальный элементы) данной матрицы;
    private static double[] findMinMax(double[][] matrix) {
        // matrixMinMax[] - Матрица для хранения минимального и максимального значений,
        // на старте записываем в нее элементы входной матрицы с индексом [0][0]
        double[] matrixMinMax = {matrix[0][0], matrix[0][0]};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > matrixMinMax[0]) {
                    matrixMinMax[0] = matrix[i][j];
                }
                if (matrix[i][j] < matrixMinMax[1]) {
                    matrixMinMax[1] = matrix[i][j];
                }
            }
        }
        return matrixMinMax;
    }


    // 2.1. найти среднеарифметическое значение всех элементов матрицы;
    private static double findAverageArith(double[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return sum / count;
    }


    // 2.2. найти среднегеометрическое значение всех элементов матрицы;
    private static double findAverageGeom(double[][] matrix, double[] minMax) {                      // double
        double mult = 1;
        int count = 0;

        // Метод Utility.checkDigit возвращает 1, если матрица не содержит отрицательное или нулевое значение
        if (Utility.checkDigit(minMax) == 1) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    mult *= matrix[i][j];
                    count++;
                }
            }
        }
        return Math.pow(mult, 1.0 / count);
    }


    //3.1. найти позицию первого встретившегося локального минимума
    private static int findLocalMin(double[][] matrix) {
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {

                if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i][j + 1]) &&
                        (matrix[i][j] < matrix[i - 1][j]) && (matrix[i][j] < matrix[i + 1][j])) {
                    System.out.println("Первый локальный минимум в позиции [" + i + "][" + j + "]");
                    return 0;
                }
            }
        }
        return -1;
    }

    //3.2. найти позицию первого встретившегося локального максимума
    private static double findLocalMax(double[][] matrix) {
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {

                if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i][j + 1]) &&
                        (matrix[i][j] > matrix[i - 1][j]) && (matrix[i][j] > matrix[i + 1][j])) {
                    System.out.println("Первый локальный максимум в позиции [" + i + "][" + j + "]");
                    return 0;
                }
            }
        }
        return -1;
    }


    // 4. транспонировать матрицу
    private static double[][] doTranspose(double[][] matrix) {      // Тип int выбран удобства проверки
        double tmp;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    break;
                } else {
                    tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }
        return matrix;
    }
}
