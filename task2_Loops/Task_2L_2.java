package by.epam.petropavlovskaya.task2loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2L_2 {

    public static void main(String args[]){
        /* Разработать наиболее эффективные алгоритмы и написать код для решения
         * следующих задач:
         * 1. найти наибольшую цифру натурального числа;
         * 2. проверить, является ли заданное натуральное число палиндромом;
         * 3. определить является ли заданное натуральное число простым;
         * 4. найти все простые делители заданного натурального числа;
         * 5. найти НОД и НОК двух натуральных чисел a и b.
         * 6. найти количество различных цифр у заданного натурального числа.
         */

        long number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два натуральных числа. Первое для задач 1-6, второе для задачи 5.");

        try {
            number1 = in.nextLong();
            number2 = in.nextLong();
            if(number1 <= 0 || number2 <=0 ){                    // Придерживаемся первой концепци, где 0 - не натуральное число.
                throw new RuntimeException();
            }

            // 1. найти наибольшую цифру натурального числа.
            System.out.println("Максимальная цифра числа " + number1 + " это "+ findMaxDigit(number1));

            // 2. проверить, является ли заданное натуральное число палиндромом.
            System.out.println("Число "+ number1 + isPalindrome(number1));

            // 3. определить является ли заданное натуральное число простым.
            if (isSimple(number1)){
                System.out.println("Число " + number1 + " простое.");
            }else {
                System.out.println("Число " + number1 + " не является простым.");
            }

            // 4. найти все простые делители заданного натурального числа.
            if (number1 < 2){
                System.out.println("У числа " + number1 + " нет простых делителей.");
            }else {
                findAllSimpleDividers(number1);
            }

            // 5. найти НОД и НОК двух натуральных чисел a и b.
            System.out.println("НОД чисел " + number1 + " и " + number2 + " = " + findNod(number1, number2));
            System.out.println("НОК чисел " + number1 + " и " + number2 + " = " + findNok(number1, number2));

            // 6. найти количество различных цифр у заданного натурального числа.
            System.out.println("Число " + number1 + " состоит из " + findAllDifferentNumbers(number1) + " различных цифр.");


        }catch (RuntimeException e) {
            System.out.println("Вы не ввели натуральное число.");
        }finally {
            in.close();
        }
    }

    // 1. Функция для поиска наибольшей цифры натурального числа.
    private static int findMaxDigit(long number){
        int digit = 0;
        if (number < 10){
            digit = (int) number;
        }
        do{
            if (number%10 > digit){
                digit = (int)(number%10);
            }
            number = number/10;
        }while (number > 0);
        return digit;
    }

    // 2. Функция для проверки, является ли заданное натуральное число палиндромом;
    private static String isPalindrome(long number){
        int count = countNumbers(number);           // Количество цифр в числе.
        int countLoop = countNumbers(number)/2;     // Количество цифр, которое будем сравнивать.
        String palindrome = "не палиндром.";
        count--;

        if (number/(int)Math.pow(10,count) == number%10){       // Если первая цифра != последней, то дальше не сравниваем.
            count--;
            number=number/10;
            for (int i=1; i<countLoop; i++){
                int nextInt = (int)(number/(int)(Math.pow(10,(--count))))%10;
                if (nextInt == number%10){
                    palindrome = " палиндром.";
                }else {
                    palindrome = " не палиндром.";
                    break;
                }
                count--;
                number=number/10;
            }
            palindrome = " палиндром.";
        }else {
            palindrome = " не палиндром.";
        }
        return palindrome;
    }

    // Для задачи 2 расчет количества цифр в числе.
    private static int countNumbers(long number){
        int count=1;    // Количество цифр в числе.
        while (number/10 >0){
            count++;
            number=number/10;
        }
        return count;
    }

    // 3. Функция для определения, является ли заданное натуральное число простым.
    private static boolean isSimple(long number){
        int summa = 1;
        boolean result = false;
        for (int i=1; i<20 & i<number ; i++){
            if (number%i == 0){
                summa++;
            }
            if (summa>2){
                result = false;
                break;
            }
        }
        if (summa<3){
            result = true;
        }
        return result;
    }

    // 4. Функция для поиска всех простых делителей заданного натурального числа.
    private static void findAllSimpleDividers(long number){
        if (isSimple(number)){
            System.out.println("У простых чисел нет простых делителей! ");
        }else {
            System.out.print("У числа " + number + " следующие простые делители: ");
            for (int i = 2; i < number; i++) {
                if (isSimple(i)) {
                    if (number % i == 0) {
                        System.out.print(i + ", ");
                    }
                }
            }
            System.out.print("\n");
        }
    }

    // 5. Функция для поиска НОД двух натуральных чисел a и b.
    private static int findNod(long number1, long number2){
        int nod = 0;
        for (int i=1; i<=number1 & i<=number2; i++){
            if ((number1%i ==0) & (number2%i ==0)){
                nod = i;
            }
        }
        return nod;
    }

    // 5. Функция для поиска НОК двух натуральных чисел a и b.
    private static long findNok(long number1, long number2){
        long nok = 0;
        long max, min;
        if (number1 > number2){
            max = number1;
            min = number2;
        }else {
            min = number1;
            max = number2;
        }

        for (int i=1; i<=min*max; i++){
            if ((max * i)%min == 0){
                nok = max*i;
                break;
            }
        }
        return nok;
    }

    // 6. Функция для поиска количества различных цифр у заданного натурального числа.
    private static int findAllDifferentNumbers(long number){
        int count = 0;
        long cloneNumber = number;
        new_loop:
        for (int i=0; i<10 & i<=number; i++){
            cloneNumber = number;
            while (cloneNumber >0){
                if (cloneNumber%10 == i){
                    count++;
                    continue new_loop;
                }
                cloneNumber/=10;
            }
        }
        return count;
    }

}


