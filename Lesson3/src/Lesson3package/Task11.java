package Lesson3package;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Введите число a: ");
		double a = scanner.nextInt();
		
		System.out.print("Введите число b: ");
		double b = scanner.nextInt();
		
		System.out.print("Введите число c: ");
		double c = scanner.nextInt();
		
		double d = b * b - 4 * a * c;
		
		if (d > 0) {
			double x1 = (-b + Math.sqrt(d)) / (2 * a);
			double x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Корень уровнения x1 = " + x1);
			System.out.println("Корень уровнения x2 = " + x2);
		} else if (d == 0) {
			double x = -b / (2 * a);
			System.out.println("Уравнение имеет один корень" + x);
		} else {
			System.out.println("Уравнение не имеет корней");
		}

	}

}
