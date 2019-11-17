package by.epam.petropavlovskaya.task2;

import java.util.Scanner;

public class Task_2_2 {
	static int age;			// Возраст дракона
	static int heads ;		// Число голов у дракона
	
	public static void main(String[] args) {
		scanAge();
		heads = sumHead(age);
		System.out.printf("The %d years old dragon has %d heads and %d eyes!", age, heads, heads*2);
		
	}

	static void scanAge(){
		System.out.println("Please, enter a dragon's age:");

		// Создаем сканнер, для считывания введенного числа и сохраняем его в переменную.
		Scanner in = new Scanner(System.in);
		age = in.nextInt();
		in.close();
	}
	
	static int sumHead(int age) {
		if (age == 0)
			return 3;
		if(age < 201)
			return sumHead(age-1)+3;
		if(age < 301)
			return sumHead(age-1)+2;
		else
			return sumHead(age-1)+1;
	}
}
