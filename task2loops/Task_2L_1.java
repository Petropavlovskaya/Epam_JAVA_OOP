package by.epam.petropavlovskaya.task2loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2L_1 {
    /* Необходимо написать программу «Heads or Tails?» («Орёл или решка?»),
     * которая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
     * сколько раз выпал орёл, а сколько – решка.
     */

    public static void main(String[] args) {
        long count=0;        // Количество раз, которое подбросим
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько раз подбросить монету? Введите число.");

        try {
            count = in.nextLong();
            if(count <= 0){
                throw new RuntimeException();
            }

            printResult(count, throwCoin(count));

        }catch (InputMismatchException i) {
            System.out.println("Вы не ввели целое число, либо число слишком велико.");
        }catch (RuntimeException e) {
            System.out.println("Невозможно подбросить монетку "+ count+ " раз.");
        }finally {
            in.close();
        }
    }

    private static long throwCoin(long count){
        long head = 0;
        for (int i=0; i<count; i++){
            int randomNum = (int)(Math.random()*10);
            if (randomNum%2 == 0){
                head+=1;
            }
        }
        return head;
    }

    private static void printResult(long count, long head){
        System.out.println("Мы подбросили монету "+ count+ " раз!");
        System.out.println(head+ " раз(а) выпал орел и "+ (count-head)+ " раз(а) выпала решка.");
    }
}
