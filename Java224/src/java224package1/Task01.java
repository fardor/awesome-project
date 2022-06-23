package java224package1;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// Задание 1
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Введите число x: ");
		int x = in.nextInt();
		
		System.out.print("Введите число y: ");
		int y = in.nextInt();
		
		System.out.println("Выбрать действие: ");
		System.out.println("1 - результат целочисленного деления x на y");
		System.out.println("2 - остаток от деления x на y");
		System.out.println("3 - квадратный корень x");
		
		int key = in.nextInt();

		switch (key) {
		case 1:
			System.out.print("Результат: " + x / y);
			break;
		case 2:
			System.out.print("Результат: " + x % y);
			break;
		case 3:
			System.out.print("Результат: " + Math.sqrt(x));
			break;
		default:
		System.out.print("Вы ввели не верное значение ");
	}


	}

}
