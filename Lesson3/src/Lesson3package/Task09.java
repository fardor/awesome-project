package Lesson3package;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int start = 0;
		int finish = 10;
		
		System.out.print("Введите 1-ю цифру на отрезке от 0 до 10: ");
		int firstСoordinate = scanner.nextInt();
		
		System.out.print("Введите 2-ю цифру на отрезке от 0 до 10: ");
		int secondСoordinate = scanner.nextInt();
		
		if (firstСoordinate == 0 && secondСoordinate == 0) {
			System.out.println("Ровная дорога");
		} else if (firstСoordinate >= 0 && secondСoordinate <= 9 && firstСoordinate < secondСoordinate) {
			System.out.println("Подъем");
		} else if (firstСoordinate <= 9 && secondСoordinate >= 0 && firstСoordinate > secondСoordinate) {
			System.out.println("Спуск");
		} else if (firstСoordinate == 10 && secondСoordinate == 0 || firstСoordinate == 0 && secondСoordinate == 10) {
			System.out.println("Отвесная стена");
		} else {
			System.out.println("Вы ввели число вне диапазоне");
		}
		
		
	}

}
