package Lesson4package;

import java.util.Scanner;

public class Work01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bit0 = 0;

		int numberN = 0b1101;
		System.out.printf("%5d -> %32s\n", numberN, Integer.toBinaryString(numberN));
		
		int result = numberN & ~(1 << bit0);
		System.out.printf("%5d -> %32s\n", result, Integer.toBinaryString(result));

		
		

		
		
	}
}
