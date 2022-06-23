import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Максимальный элемент массива = " + max);
		
	

		
		
		
		
		

	}

}
