package Lesson4package;

public class Work12 {

	public static void main(String[] args) {

		String str = "1111111111111111111011111111111";
		char[] strToArrey = str.toCharArray();
		
		int binaryDigit = Integer.parseInt(str, 2);
		System.out.printf("Число в двоичной системе = %32s\nВ десятеричной системе = %d", str, binaryDigit);

		System.out.println();
		
		for (int i = 0; i < strToArrey.length; i++) {
			if (strToArrey[i] == strToArrey[0]) {
				System.out.println("В этом числе есть хотя бы один 0");
				break;
			} else {
				System.out.println("В этом числе нет 0");
				break;
			}
		}
		

		



		
	}
}
