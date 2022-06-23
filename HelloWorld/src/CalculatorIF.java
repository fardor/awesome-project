import java.util.Scanner;

public class CalculatorIF {

	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
		
		System.out.print("введите первое число ");
		if (scanner.hasNextInt()) {
			int first = scanner.nextInt();
	
			System.out.print("введите второе число ");
			if (scanner.hasNextInt()) {
				int second = scanner.nextInt();
			
			System.err.println("введите знак операции ");
			char operation = scanner.next().charAt(0);
			
			boolean isCorrectOperation = true;
			boolean isZeroDivizion = false;
			int result = 0;
			
			if (operation == '+') {
				result = first + second;
			} else if (operation == '-') {
				result = first + second;
			} else if (operation == 'x' || operation == '*') {
				result = first * second;
			} else if (operation == ':' || operation == '/') {
				if (second == 0) {
					isZeroDivizion = true;
				} else {
					result = first / second;
				}
			} else {
				isCorrectOperation = false;
			}
			
			if (!isCorrectOperation) {
				System.err.println("нет такой операции (" + operation + ")");
			} else if (isZeroDivizion) {
				System.out.println("На 0 делить нельзя!");
			} else {
				System.out.println("result = " + result);
			}


			} else {
				System.err.println("Ошибка");
			}
			
		} else {
			System.err.println("Ошибка");
		}
		
		scanner.close();
		
		
		//if (operation == '+') {
//		result = first + second;
	//} else if (operation == '-') {
//		result = first + second;
	//} else if (operation == 'x') {
//		result = first * second;
	//} else if (operation == ':') {
//		result = first / second;
	//} else {
//		isCorrectOperation = false;
	//}

	}

}
