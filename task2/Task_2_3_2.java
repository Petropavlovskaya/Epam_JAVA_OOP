package by.epam.petropavlovskaya.task2;

import java.util.Scanner;

public class Task_2_3_2 {

	public static void main(String[] args) {
		// Объявляем переменные для введенного числа, его суммы и произведения 
		String s;
		int mas[] = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};
				
		System.out.println("Введите символ:");
			
		/* Создаем сканнер, для считывания введенного символа и сохраняем его в переменную.  
		 * В данном примере предполагается корректный ввод без учета кириллицы. 
		 */
		Scanner in = new Scanner(System.in);
		s = in.next();
		in.close();
		
		char c = s.charAt(0);
		
		
		/*for(int i:mas) {
			if(i==(int)c) {
				System.out.println(c + " - Гласная");
				break;
			}
			else {
				System.out.println(c + " - Не гласная");
				//break;
			}
		}*/
		
		
	for(int i:mas) {
		if(i !=(int)c) {
			System.out.println(c + " - Не Гласная");
			break;
		}
		else {
			System.out.println(c + " - Не гласная");
			//break;
		}
	}

	}

}
