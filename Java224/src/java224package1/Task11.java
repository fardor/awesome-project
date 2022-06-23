package java224package1;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// Задание 11
		Scanner in = new Scanner (System.in);
		
		System.out.print("Введите количество секунд ");
		int secondTime = in.nextInt();
		
		System.out.print((secondTime / 84600) + " дней, " 
		+ ((secondTime % 84600) / 3600) + " часов, " 
				+ (((secondTime % 84600) % 3600) / 60) + " минут, " 
		+ (((secondTime % 84600) % 3600) % 60) + " секунд ");
	
		
		
	}

}
