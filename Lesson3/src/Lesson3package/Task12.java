package Lesson3package;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Введите шестизначное число: ");
		int number = scanner.nextInt();
		
		int sum1 = ((number % 1000 / 100) + ((number % 100) / 10) + (number % 10));
		int sum2 = ((number / 100000) + ((number / 10000) % 10)) + ((number / 1000) % 10);
		
		boolean luckyTicket = (sum1 == sum2);
		boolean isNotluckyTicket = (sum1 != sum2);
		
		if (number > 999999) {
			System.out.println("Вы ввели слишком большое число!");
		} else if (number < 100000) {
			System.out.println("Вы ввели слишком маленькое число!");
		} else if (luckyTicket) {
			System.out.println("Ваш билет является счастливым!");
		} else if (isNotluckyTicket) {
			System.out.println("Неудача, ваш билет не является счастливым числом");
		}

	}

}
