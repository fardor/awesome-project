import java.util.Scanner;

public class Experiment2 {

	public static void main(String[] args) {
		int a = 153257;
		int sum = a / 100000;
		int sum2 = a % 100000 / 1000 / 10;
		int sum3 = a % 100000 / 100 % 100 / 10;
		int sum4 = a % 1000 / 100;
		int sum5 = a % 1000 / 10 % 10;
		int sum6 = a % 100000 % 1000 % 10;
		
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
		



		

		

	}
}
