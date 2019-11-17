package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_7 {
	static int a, b;	// Объявляем переменные для введенных чисел

	public static void main(String[] args) {
		scanNumber();
		replaceNumber();
		printRez();
	}

	static void scanNumber(){
		// Создаем сканнер, для считывания потока ввода. В данном примере не предусмотрена проверка вводимых данных
		Scanner in = new Scanner(System.in);

		// Считываем числа, введенные с консоли и сохраняем их значения в переменные.
		System.out.println("Please, enter the number 1:");
		a = in.nextInt();
		System.out.println("Please, enter the number 2:");
		b = in.nextInt();
		in.close();
	}

	static void replaceNumber(){
		// Меняем числа местами
		a=a+b;
		b=a-b;
		a=a-b;
	}

	static void printRez(){
		System.out.println("New number 1 is: " + a);
		System.out.println("New number 2 is: " + b);
	}

}
