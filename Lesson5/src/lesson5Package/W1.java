package lesson5Package;

import java.util.Scanner;

public class W1 {

	public static void main(String[] args) {
		
		/*Задание 1
		Числа Фибоначчи – это последовательность чисел, в ко-
		торой два первых числа последовательности равны 0 и 1, а
		каждое последующее число равно сумме двух предыдущих.
		Показать на экране все числа Фибоначчи в диапазоне от
		0 до 10 000 000.*/
		
		// свои комментарии не удалял, оставил для себя)))
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите границу диапазона чисел Fibonacchi (до 10000000): ");
		int endOfFibonacchiNumbers = scanner.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 0; i < endOfFibonacchiNumbers; i++) {
			int bufferSum = num1 + num2; // = 0 + 1 = 1 // 1 + 1 = 2 // 1 + 2 = 3 // 2 + 3 = 5; 
			num1 = num2;  // num1 = 1 (сумме) // num 1 = 1 // num 1 = 2; // num 1 = 3;
			num2 = bufferSum; // num2 = 1 (сумме буфера) // num2 = 2 // num 2 = 3 //
			System.out.println(num2);
		}
		
		
		
		
	}

}
