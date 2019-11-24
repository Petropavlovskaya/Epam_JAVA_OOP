package by.epam.petropavlovskaya.task2loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2L_3 {
    public static void main(String args[]){
        /* Натуральное число называют совершенным, если оно равно сумме всех своих
         * делителей, не считая только его самого (например, 28=1+2+3+7+14 –
         * совершенное число). Напишите программу, которая проверяет, является ли
         * введённое натуральное число совершенным. Для проверки работоспособности
         * программы приводится список некоторых совершенных чисел: 6, 28, 496, 8128.
         */

        long number;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число.");

        try {
            number = in.nextLong();
            if(number <= 1){                    // Совершенное число имеет минимум 2 делителя.
                throw new RuntimeException();
            }
            printResult(isNaturalNumber(number), number);

        }catch (InputMismatchException i) {
            System.out.println("Вы не ввели целое число.");
        }catch (RuntimeException e) {
            System.out.println("Введенное число должно быть больше 1.");
        }finally {
            in.close();
        }
    }

    static private long isNaturalNumber(long number){
        long sum=1;
        int div=2;
        double limit = Math.sqrt(number);
        while (div<=limit){
            if (number%div == 0){
                sum+=div;
                sum+=number/div;
            }
            div+=1;
        }
        return sum;
    }

    static private void printResult(long sum, long number){
        if (sum == number){
            System.out.println(number+ " это совершенное число!");
        }
        else {
            System.out.println(number+ " не совершенное число.");
        }
    }

}
