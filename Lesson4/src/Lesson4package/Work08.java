package Lesson4package;

import java.util.Scanner;

public class Work08 {

	public static void main(String[] args) {
		
		// это задание увы так сделать и не смог, как мне кажется правильно, максимум сделал 
		// смещение, а хотелось бы сделать чтобы впереди был 0, остальные единицы, хотя может так в принципе нельзя.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите номер бита: ");
		int bitNumber = scanner.nextInt();
		
		int numberN = 0b1111111111111111111111111111111;
		System.out.printf("%5d -> %32s\n", numberN, Integer.toBinaryString(numberN));
		
		int result = numberN & (numberN >>> 1);
		System.out.printf("%5d -> %32s\n", result, Integer.toBinaryString(result));

		
	}

}
