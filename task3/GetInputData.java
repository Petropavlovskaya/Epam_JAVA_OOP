package by.epam.petropavlovskaya.task3;


import java.util.Scanner;

class GetInputData {

    private static final double[] limits = new double[2];            // Переменные для ввода границ при генерировании случайных чисел

    static double[] getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа, задающие границы значений при инициализации матрицы.");
        try {
            limits[0] = in.nextDouble();
            limits[1] = in.nextDouble();
        } catch (RuntimeException e) {
            System.out.println("Ошибка ввода.");
            System.exit(0);
        }
        return limits;
    }


}
