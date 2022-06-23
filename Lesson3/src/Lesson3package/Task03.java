package Lesson3package;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Выберете животное из списка: ");
		System.out.print(" 1 - кошка\n 2 - собака\n 3 - тигр\n 4 - волк\n 5 - свинья\n 6 "
				+ "- корова\n 7 - петух\n 8 - лягушка\n 9 - утка\n 10 - лошадь\n");
		
		System.out.print("Введите число: ");
		int key = scanner.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("мяу-мяу");
			break;
		case 2:
			System.out.println("гав-гав");
			break;
		case 3:
			System.out.println("ррррр");
			break;
		case 4:
			System.out.println("ауууу");
			break;
		case 5:
			System.out.println("хрю-хрю");
			break;
		case 6:
			System.out.println("мууууу");
			break;
		case 7:
			System.out.println("ку-ка-ре-ку");
			break;
		case 8:
			System.out.println("ква-ква");
			break;
		case 9:
			System.out.println("кря-кря");
			break;
		case 10:
			System.out.println("иго-го-го");
			break;
			

		default:
			break;
		}
		

	}

}
