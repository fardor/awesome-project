import java.util.Scanner;

public class Experiment {

	public static void main(String[] args) {
		
		// калькулятор
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
			
			switch (operation) {
			case '+':
				result = first + second;
				break;
			case '-':
				result = first - second;
				break;
			case 'x':
			case '*':
				result = first * second;
				break;
			case ':':
			case '/':
				if (second == 0) {
					isZeroDivizion = true;
				} else {
					result = first / second;
				}
				break;
			default:
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
		
		scanner.close();
		
	
	}

}

}


