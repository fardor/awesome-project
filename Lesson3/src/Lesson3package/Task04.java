package Lesson3package;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Введите точку координат x: ");
		int x = scanner.nextInt();
		System.out.print("Введите точку координат y: ");
		int y = scanner.nextInt();
		
		if (x >= 0 && y >= 0) {
			System.out.println("Результат = I");
			
		} else if (x <= 0 && y >= 0) {
			System.out.println("Результат = II");
		
		} else if (x <= 0 && y <= 0) {
			System.out.println("Результат = III");
		
		} else if (x >= 0 && y <= 0) {
			System.out.println("Результат = IV");
		}
	}
}
