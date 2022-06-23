package java224package1;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// Задание 12
		Scanner in = new Scanner (System.in);
		
		System.out.print("Введите количество учеников: ");
		int students = in.nextInt();
		
		int pie = 1;
		float glassOfMilk = 0.200f;
		float boxOfMilk = 0.900f;
		
		System.out.println("Выберете ситуацию: ");
		System.out.println("1 - если в школе 100% всех учеников, у которых вес меньше 30 кг ");
		System.out.println("2 - если в школе 60% учеников имеют вес меньше 30 кг ");
		System.out.println("3 - если в школе 1% учеников имеют вес меньше 30 кг ");
		
		System.out.print("Введите номер ситуации: ");
		int key = in.nextInt();
		
		switch(key) {
		case 1:
			int resultPie = students * (pie + pie);
			System.out.println("Кол-во пирожков: " + resultPie);
			double resultMilk = (students * glassOfMilk) / boxOfMilk;
			double value = Math.ceil(resultMilk);
			System.out.println("Кол-во пакетов молока: "  + value);
			break;
			
		case 2:
			int resultPie2 = ((students * 60) / 100) * (pie + pie);
			System.out.println("Кол-во пирожков: " + resultPie2);
			double resultMilk2 = (((students * 60) / 100) * glassOfMilk) / boxOfMilk;
			double value2 = Math.ceil(resultMilk2);
			System.out.println("Кол-во пакетов молока "  + value2);
			break;
			
		case 3:
			int resultPie3 = ((students * 1) / 100) * (pie + pie);
			System.out.println("Кол-во пирожков: " + resultPie3);
			double resultMilk3 = (((students * 1) / 100) * glassOfMilk) / boxOfMilk;
			double value3 = Math.ceil(resultMilk3);
			System.out.println("Кол-во пакетов молока "  + value3);
			break;
			
			default:
				System.out.println("Введите верное значение ");
				break;
			

		}

		
		
	}

}
