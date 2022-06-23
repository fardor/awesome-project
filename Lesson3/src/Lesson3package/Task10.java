package Lesson3package;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		// ЗАДАНИЕ РЕШИЛ УСЛОЖНИТЬ И НАПИСАТЬ ТАКУЮ ВОТ БОЛЕЕ МЕНЕЕ КРАСИВУЮ ПРОГРАММКУ))
		// Знаю что массивы не проходили, но вот решил с ними сделать))
		
		Scanner scanner = new Scanner (System.in);
	
		// ПЕРВЫЙ ПОДЪЕЗД
		int[] firstDoorWay = new int[27];
		for (int i = 0; i < firstDoorWay.length; i++) {
			firstDoorWay[i] = i+1;
		}
		
		System.out.println("1-й подъезд: ");
		
		for (int i = 0; i < firstDoorWay.length; i++) {
			System.out.println("Квартира #: " + firstDoorWay[i]);
		}
		
		// ВТОРОЙ ПОДЪЕЗД
		int[] secondDoorWay = new int[27];
		for (int i = 0; i < firstDoorWay.length; i++) {
			secondDoorWay[i] = i+28;
		}
		
		System.out.println();
		System.out.println("2-й подъезд: ");
		
		for (int i = 0; i < secondDoorWay.length; i++) {
			System.out.println("Квартира #: " + secondDoorWay[i]);
		}
		
		int[] thirdDoorWay = new int[27];
		for (int i = 0; i < thirdDoorWay.length; i++) {
			thirdDoorWay[i] = i+55;
		}
		
		System.out.println();
		System.out.println("3-й подъезд: ");
		
		for (int i = 0; i < thirdDoorWay.length; i++) {
			System.out.println("Квартира #: " + thirdDoorWay[i]);
		}
		
		System.out.println();
		System.out.print("Введите номер квартиры ");
		int key = scanner.nextInt();
		
		if (key >= 1 && key <= 27) {
			System.out.println("1-й подъезд");
		} else if (key >= 28 && key <= 54) {
			System.out.println("2-й подъезд");
		} else if (key >= 55 && key <= 81) {
			System.out.println("3-й подъезд");
		}
		
		
		// А здесь второе решение, более простое))
		
		/*int volumeOfDoorWay = 3;
		int volumeOfFloor = 9;
		int volumeOfFlatInDoorWay = 3;
		int volumeOfFlat = volumeOfFloor * volumeOfFlatInDoorWay;
		
		System.out.println("Всего квартир в подъезде " + volumeOfFlat);
		
		System.out.print("Введите номер квартиры ");
		int key = scanner.nextInt();
		
		if (key >= 1 && key <= 27) {
			System.out.println("1-й подъезд");
		} else if (key >= 28 && key <= 54) {
			System.out.println("2-й подъезд");
		} else if (key >= 55 && key <= 81) {
			System.out.println("3-й подъезд");
		}*/
		


	}

}
