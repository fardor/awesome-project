package Lesson4package;

import java.util.Scanner;

public class Work02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите степень: ");
		int degree = scanner.nextInt();

		int numberN = 0b0010;
		System.out.printf("%3d -> %32s\n", numberN, Integer.toBinaryString(numberN));
		
		int result = numberN << degree-1;
		System.out.printf("%3d -> %32s\n", result, Integer.toBinaryString(result));
		
		System.out.println(numberN + " в степени " + degree + " = " + result);

	}

}
