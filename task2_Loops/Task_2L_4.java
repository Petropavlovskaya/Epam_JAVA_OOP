package by.epam.petropavlovskaya.task2loops;

import java.util.Scanner;

public class Task_2L_4 {
    static long startTime;
    public static void main(String args[]){
        /* Дру́жественные чи́сла — два различных натуральных числа , для которых
         * сумма всех собственных делителей первого числа равна второму числу и
         * наоборот, сумма всех собственных делителей второго числа равна первому
         * числу. Дружественные числа были открыты последователями Пифагора ,
         * которые, однако, знали только одну пару дружественных чисел – 220 и 284.
         * Найдите все дружественные числа в заданном диапазоне.
         */

        long number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два натуральных числа, которые составят диапазон поиска дружественных чисел.");

        try {
            number1 = in.nextLong();
            number2 = in.nextLong();
            if(number1 <= 0 || number2 <=0 ){                    // Придерживаемся первой концепци, где 0 - не натуральное число.
                throw new RuntimeException();
            }

            if ((number1 >= 220) & (number2 >= 220)) {
                areFriendly(Math.min(number1, number2), Math.max(number1, number2));
            }
            else {
                System.out.println("В заданном диапазоне поиска нет дружественных чисел.");
            }

        }catch (RuntimeException e) {
            System.out.println("Вы не ввели натуральное число.");
        }finally {
            in.close();
        }
    }

    private static void areFriendly(long first, long last){
        int count = 1;
        for (long i=first; i<=last; i++){
            for (long j=first+1; j<=last; j++) {
                // Проверка на четность для ускорения расчетов (все дружестве пары имеют одинаковую четность).
                if (i%2 == j%2) {
                    if ((sumAllDividers(i) == j) && (sumAllDividers(j) == i) && (i < j)) {
                        System.out.println(count + ". Числа " + i + " и " + j + " являются дружественными.");
                        count++;
                        break;
                    }
                }
            }
        }
        if (count == 1){
            System.out.println("В заданном диапазоне поиска нет дружественных чисел.");
        }
    }

    private static long sumAllDividers(long number){
        long sumDiv = 1;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                sumDiv += i;
                sumDiv += number/i;
            }
        }
        return sumDiv;
    }
}
