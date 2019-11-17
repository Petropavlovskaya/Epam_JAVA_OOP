package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_6 {
	// Объявляем переменные для введенного числа и его цифр
	static int num;
	static int mas[] = new int[7];

	public static void main(String[] args) {
		scanNumber();
		splitNumber();
		printRez();
	}

	static void scanNumber(){
		System.out.println("Please, enter the number:");

		/* Создаем сканнер, для считывания введенного числа и сохраняем его в переменную.
		 * В данном примере предполагается, что вводится положительное число
		 */
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
	}

	static void splitNumber(){
		// Записываем цифры числа в массив
		for(int i=0; num>0; i++) {
			mas[i] = num%10;
			num/=10;
		}
	}

	static void printRez(){
		// Т.к. цифры в массив вносились с конца, выводим значения массива через foreach
		for(int i:mas)
			System.out.print(i);
	}

}
