package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_1 {
    static float masNum[] = new float[3];

    public static void main(String[] args) {
		readNumber();
		compareNumber(masNum);
	}

	static void readNumber(){
        // Создаем сканнер, для считывания потока ввода. В данном примере не ловим эксепшены.
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter three numbers.");

        // Считываем числа, введенные с консоли и сохраняем их значения в переменные.
        System.out.println("Number 1:");
        masNum[0] = in.nextFloat();
        System.out.println("Number 2:");
        masNum[1] = in.nextFloat();
        System.out.println("Number 3:");
        masNum[2] = in.nextFloat();
        in.close();
    }

    static void compareNumber(float mas[]){
        if(mas[0] == mas[1] & mas[1] == mas[2])
            System.out.println("Numbers are the same");
        else
            System.out.println("Numbers are different");
    }
	

}
