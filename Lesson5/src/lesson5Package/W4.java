package lesson5Package;

public class W4 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1000000;
		int sum;
		
		for (int i = a; i < b; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
					if (sum == i) {
						System.out.printf("%d\n", i);
					}
				}
			}
		}
	}
}
