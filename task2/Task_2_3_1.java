package by.epam.petropavlovskaya.task2;

import java.util.Scanner;

public class Task_2_3_1 {

	public static void main(String[] args) {
		// Объявляем переменные для введенного числа, его суммы и произведения 
		String s;
				
		System.out.println("Введите символ:");
			
		/* Создаем сканнер, для считывания введенного символа и сохраняем его в переменную.  
		 * В данном примере предполагается корректный ввод без учета кириллицы. 
		 */
		Scanner in = new Scanner(System.in);
		s = in.next();
		in.close();
		
		char c = s.charAt(0);
		
		switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case '\u0041':
				System.out.println(c + " - Гласная");
				break;
			default: 
				System.out.println(c + " - Не гласная");
		}

	}

}
