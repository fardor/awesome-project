package lesson5Package;

public class W3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 1000000;
		double extent = 10; // степень можно указать любую, поставил 10, чтобы алгоритм не был медленным, т.к. больше не требуется
		
		for (int i = a; i < b; i++) {
			int length = String.valueOf(i).length();
			
			if (length == 2) {
				int one2 = i / 10;
				int two2 = i % 10;
				
				for (int j = 1; j < extent; j++) {
					if (Math.pow(one2, j) + Math.pow(two2, j) == i && length == j) {
						System.out.println(i);
					}
				}
			}
			else if (length == 3) {
				int one3 = i / 100;
				int two3 = i % 100 / 10;
				int three3 = i % 100 % 10;
				
				for (int k = 1; k < extent; k++) {
					if (Math.pow(one3, k) + Math.pow(two3, k) + Math.pow(three3, k) == i && length == k) {
						System.out.println(i);
					}
				}	
			}
			else if (length == 4) {
				int one4 = i / 1000;
				int two4 = i % 1000 / 100;
				int three4 = i % 1000 / 10 % 10;
				int four4 = i % 1000 % 100 % 10;
				
				for (int m = 1; m < extent; m++) {
					if (Math.pow(one4, m) + Math.pow(two4, m) + Math.pow(three4, m) + Math.pow(four4, m) == i && length == m) {
						System.out.println(i);
					}
				}
			}
			else if (length == 5) {
				int one5 = i / 10000;
				int two5 = i % 10000 / 100 / 10;
				int three5 = i % 10000 / 100 % 10;
				int four5 = i % 10000 % 100 % 100 / 10;
				int five5 = i % 10000 % 100 % 100 % 10;
				
				for (int n = 1; n < extent; n++) {
					if (Math.pow(one5, n) + Math.pow(two5, n) + Math.pow(three5, n) + Math.pow(four5, n) + Math.pow(five5, n) == i && length == n) {
						System.out.println(i);
					}
				}
			}
			else if (length == 6) {
				int one6 = i / 100000;
				int two6 = i % 100000 / 1000 / 10;
				int three6 = i % 100000 / 100 % 100 / 10;
				int four6 = i % 1000 / 100;
				int five6 = i % 1000 / 10 % 10;
				int six6 = i % 100000 % 1000 % 10;
				
				for (int p = 1; p < extent; p++) {
					if (Math.pow(one6, p) + Math.pow(two6, p) + Math.pow(three6, p) + Math.pow(four6, p) + Math.pow(five6, p) + Math.pow(six6, p) == i && length == p) {
						System.out.println(i);
					}
				}
			}
		}
		

	}
}
