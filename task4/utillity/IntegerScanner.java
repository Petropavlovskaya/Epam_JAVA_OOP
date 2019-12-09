package by.epam.petropavlovskaya.task4.utillity;

import java.util.Scanner;

public class IntegerScanner {

    // Сканер принимает значения int >= 0
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
}
