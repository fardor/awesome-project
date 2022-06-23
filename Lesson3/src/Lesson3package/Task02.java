package Lesson3package;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите кол-во часов от 0 до 24: ");
		int key = scanner.nextInt();
		
		if (key >= 4 && key <=11) {
			System.out.println("Доброе утро!");
		} 
		else if (key >= 12 && key <= 16) {
			System.out.println("Добрый день!");
		}
		else if (key >= 17 && key <= 23) {
			System.out.println("Добрый вечер!");
		}
		else if (key >= 0 && key <= 3) {
			System.out.println("Доброй ночи!");
		}
	}

}
