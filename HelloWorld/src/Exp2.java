
public class Exp2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 9000;
		double extent = 10;
		
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
		}
		
		

	}

}
