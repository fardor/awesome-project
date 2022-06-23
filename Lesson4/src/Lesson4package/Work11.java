package Lesson4package;

import java.util.Scanner;

public class Work11 {

	public static void main(String[] args) {
		String str = "1111111111111111111001111111111";
		char[] strToArrey = str.toCharArray();
		
		int binaryDigit = Integer.parseInt(str, 2);
		System.out.printf("Число в двоичной системе = %32s\nВ десятеричной системе = %d", str, binaryDigit);

		System.out.println();
		
		int quantityOfUnit = 0;
		
		for (int i = 0; i < strToArrey.length; i++) {
			if (strToArrey[i] == strToArrey[1]) {
				quantityOfUnit++; 
			} 
		}
		System.out.println("Количество единиц в этом числе: " + quantityOfUnit);
	}
}
