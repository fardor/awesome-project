package Lesson4package;

import java.util.Scanner;

public class Work09 {

	public static void main(String[] args) {
		
		int m = 0b1011;
		int n = 0b11111111111111111111111111111111;
		
		if ((m < 0 & n > 0) | (m > 0 & n < 0)) {
			System.out.println("Числа имеею разные знаки");
		} else {
			System.out.println("Два числа имеют одинаковый знак");
		}
	}
}
