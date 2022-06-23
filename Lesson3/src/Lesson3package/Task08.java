package Lesson3package;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Введите число x: ");
		int x = scanner.nextInt();
		System.out.print("Введите число y: ");
		int y = scanner.nextInt();
		
		if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0) ) {
			System.out.println("YES");
		}
		

	}

}
