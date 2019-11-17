package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_5 {
	static int num, sum=0, mul=1;	// Объявляем переменные для введенного числа, его суммы и произведения

	public static void main(String[] args) {
		scanNumber();
		calcSumMult();
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

	static void calcSumMult(){
		// вычисляем сумму и произведение цифр введенного числа
		for(; num>0; ) {
			sum += num%10;	// Суммируем цифры
			mul *= num%10;	// Перемножаем цифры
			num/=10;
		}
	}

	static void printRez(){
		// Выводим результат на печать
		System.out.printf("Среднее арифметическое цифр введенного числа: %.2f \n", (float)sum/6);
		System.out.printf("Среднее геометрическое цифр введенного числа: %.2f", (float)Math.pow(mul, 1.0/6.0));
	}



}
