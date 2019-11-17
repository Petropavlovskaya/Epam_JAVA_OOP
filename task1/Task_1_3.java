package by.epam.petropavlovskaya.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1_3 {

	static float r1, r2;	// ќбъ€вл€ем переменные дл€ радиуса кругов
	static double s1, s2;	// ќбъ€вл€ем переменные дл€ площади кругов

	public static void main(String[] args) {//throws Throwable{} {
		scanRadious();
		printSquare();
	}

	static void scanRadious(){
		/* —оздаем сканнер, дл€ считывани€ потока ввода.
		 * ¬ данном примере предусмотрена обработка ввода "не числа" и отрицательного числа.
		 */
		Scanner in = new Scanner(System.in);
		try {
			// —читываем числа, введенные с консоли и сохран€ем их значени€ в переменные.
			System.out.println("Please, enter the radius #1:");
			r1 = in.nextFloat();
			if(r1<0)
				throw new RuntimeException();

			System.out.println("Please, enter the radius #2:");
			r2 = in.nextFloat();
			if(r2<0 || r2>r1)
				throw new RuntimeException();
		}catch (InputMismatchException i) { System.out.println("You didn't enter a number!");
		}catch (RuntimeException e) { System.out.println("Please, enter another number");
		}finally {in.close();
		}
	}

	static void printSquare(){
		s1 = Math.PI*r1*r1;
		s2 = Math.PI*r2*r2;
		System.out.printf("The square of the ring is: %.4f", (s1-s2));
	}


}
