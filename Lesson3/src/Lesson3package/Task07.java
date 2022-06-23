package Lesson3package;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Введите букву: ");
		char key = scanner.next().charAt(0);
		
		boolean isDigit1 = Character.isDigit(key);
		boolean isLetter1 = Character.isLetter(key);
		boolean isCyrillic = Character.UnicodeBlock.of(key).equals(Character.UnicodeBlock.CYRILLIC);
		boolean isLatin = Character.UnicodeBlock.of(key).equals(Character.UnicodeBlock.BASIC_LATIN);
		boolean isNotDigitOrSymbol = Character.isDigit(key) || Character.isLetter(key);
		
		if (isDigit1) {
			System.out.println("Цифра");	
		}
		
		if (isLetter1) {
			
			if (isCyrillic) {
				System.out.println("Кирилица");
			} if (isLatin) {
				System.out.println("Латиница");
			} 
			
		}
		
		if (!isNotDigitOrSymbol) {
			System.out.println("Невозможно определить");
		}

	}

}
