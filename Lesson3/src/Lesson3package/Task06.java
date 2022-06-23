package Lesson3package;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите год: ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0) || (year % 400 == 0)) {
			System.out.println("Этот год високосный");
		}
		
		else {
			System.out.println("Это обычный год, не високосный!");
		}

		
		
	}

}
