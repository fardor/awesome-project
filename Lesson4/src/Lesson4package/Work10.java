package Lesson4package;

public class Work10 {

	public static void main(String[] args) {
		int m = 0b1011;
		int n = 0b11111111111111111111111111111111;
		
		if (m < n) {
			System.out.print("Минимальное значение: ");
			System.out.printf("%3d -> %32s\n", m, Integer.toBinaryString(m));
		} else {
			System.out.print("Минимальное значение: ");
			System.out.printf("%3d -> %32s\n", n, Integer.toBinaryString(n));
		}

	}

}
