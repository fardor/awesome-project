package Lesson4package;

import java.util.Scanner;

public class Work06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите номер бита: ");
		int bitNumber = scanner.nextInt();
		
		int numberN = 0b101111;
		System.out.printf("%5d -> %32s\n", numberN, Integer.toBinaryString(numberN));
		
		int result = numberN & (~((1 << bitNumber) - 1));
		System.out.printf("%5d -> %32s\n", result, Integer.toBinaryString(result));

	}
}
