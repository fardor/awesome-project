import java.util.Iterator;

public class Ex1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5000;
		double extent = 1;
		
		for (int i = a; i < b; i++) {
			int length = String.valueOf(i).length();
			
			if (length == 2) {
				int one2 = i / 10;
				int two2 = i % 10;
				int sum2 = one2 + two2;
				while (extent < b) {
					if (Math.pow(one2, extent) + Math.pow(two2, extent) == i) {
						System.out.println(i);
					}
					extent++;
				}

			}
			else if (length == 3) {
				int one3 = i / 100;
				int two3 = i % 100 / 10;
				int three3 = i % 100 % 10;
				if (Math.pow(one3, extent) + Math.pow(two3, extent) + Math.pow(three3, extent) == i) {
					System.out.println(i);
				}
			}
			else if (length == 4) {
				int one4 = i / 1000;
				int two4 = i % 1000 / 100;
				int three4 = i % 1000 / 10 % 10;
				int four4 = i % 1000 % 100 % 10;
				
				for (double m = 1; m < b; m++) {
					if (Math.pow(one4, m) + Math.pow(two4, m) + Math.pow(three4, m) + Math.pow(four4, m) == i) {
						System.out.println(i);
					}
				}

			}
		}

	}

}
