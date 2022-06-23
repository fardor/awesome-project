package java224package1;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// Задание 7
		
		Scanner in = new Scanner (System.in);
		
		float annualInterest = 0.11f;
		int timeDeposit = 24;
		float sumDeposit;
		
		System.out.print("Введите сумму вклада: ");
		int Deposit = in.nextInt();
		
		sumDeposit = Deposit * annualInterest * 24;
		
		System.out.println(sumDeposit);
		
		
		
		
		
		
		
		

		

	}

}
