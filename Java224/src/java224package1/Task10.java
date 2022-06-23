package java224package1;

public class Task10 {

	public static void main(String[] args) {
		// Задание 10
		final int height = 180;
		final int weight = 75;
		
		int weightIdeal = height - 110;
		
		if (weightIdeal < weight) {
			System.out.println("Вам нужно набрать: " + (weight - weightIdeal) + " кг");
		} 
		
		if (weightIdeal > weight) {
			System.out.println("Вам нужно cбавить: " + (weightIdeal - weight) + " кг");
		}
		
		

	}

}
