package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_4 {
	// Объявляем переменные для введенного числа и составляющих его цифр
	static int i, n1, n2, n3, n4;

	public static void main(String[] args) {
		scanNumber();
		splitNumber();
		compareNumber();
	}

	static void scanNumber(){
		System.out.println("Please, enter the number:");

		/* Создаем сканнер, для считывания введенного числа и сохраняем его в переменную.
		 * В данном примере предполагается корректный ввод (вводится четырехзначное число)
		 */
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		in.close();
	}

	static void splitNumber(){
		// Разбиваем число на цифры. Т.е. количество цифр малое, обходимся без массива
		n1 = i/1000;	//  Первая цифра числа
		n2 = i/100%10;	//  Вторая цифра числа
		n3 = i/10%10;	//  Третья цифра числа
		n4 = i%10;		//  Четвертая цифра числа
	}

	static void compareNumber(){
		if( n1<n2 & n2<n3 & n3<n4 )
			System.out.println("This sequence is increasing");

		else if( n1>n2 & n2>n3 & n3>n4 )
			System.out.println("This sequence is decreasing");
		else
			System.out.println("This sequence is messy");
	}

}
