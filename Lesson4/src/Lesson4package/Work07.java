package Lesson4package;

import java.util.Scanner;

public class Work07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите номер бита: ");
		int bitNumber = scanner.nextInt();

		
		int numberN = 0b1011;
		System.out.printf("%3d -> %32s\n", numberN, Integer.toBinaryString(numberN));
		
		int result = numberN & (1 << bitNumber);
		System.out.printf("%3d -> %32s\n", result, Integer.toBinaryString(result));
		
		switch (result) {
		case 0:
			System.out.println("Значение " + bitNumber + " бита равно " + result);
			break;
		case 1:
			System.out.println("Значение " + bitNumber + " бита равно " + result);
			break;
		default:
			break;
		}
		
	}

}
