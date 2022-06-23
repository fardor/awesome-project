import java.util.Scanner;

public class Experiment1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		// попадает или не попадает в диапазон
		
		System.out.print("Введите первую границу диапазона ");
		int num1 = scanner.nextInt();
		System.out.print("Введите вторую границу диапазона ");
		int num2 = scanner.nextInt();
		System.out.print("Введите число ");
		int num3 = scanner.nextInt();
		
		System.out.printf("%d  - первая граница\n%d - вторая граница\n%d  - ваше число\n", num1, num2, num3);
		
		if (num3 > num1 && num3 < num2 || num3 < num1 && num3 > num2) {
			System.out.println("Ваше число попадает в диапазон");
		}
		

	}

}
