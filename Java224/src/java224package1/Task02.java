package java224package1;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// Задание 2
		Scanner in = new Scanner (System.in);
		
		System.out.print("Введите число: ");
		int a = in.nextInt();
		int sum = 0;
		
		while (a != 0 ) {
			sum += a % 10;
			a /= 10;
		}
		System.out.println("Результат суммы чисел: " + sum);
	}

}
