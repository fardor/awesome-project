package java224package1;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// Задание 9
		Scanner in = new Scanner (System.in);
		
		System.out.print("Введите число ");
		float numb = in.nextFloat();
		
		if (numb % 1 == 0) {
			System.out.print("Число без вещественной части");
		} else {
			System.out.print("Число с вещественной частью");
		}
		
		
	}

}
