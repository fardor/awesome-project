package Lesson3package;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String[] arrZodiak = {"Овен", "Телец", "Близнецы", "Рак", "Лев", "Дева", "Весы", "Скорпион", "Стрелец", "Козерог", "Водолей", "Рыбы"};
		String[] arrChina = {"Крыса", "Бык", "Тигр", "Кролик", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Петух", "Собака", "Свинья"};
		
		String Zodiak = arrZodiak[0];
		String China = arrChina[0];
		
		
		System.out.print("Введите день своего рождения: ");
		int dayOfBirthday = scanner.nextInt();
		
		System.out.print("Введите месяц своего рождения: ");
		int monthOfBirthday = scanner.nextInt();
		
		System.out.print("Введите год своего рождения: ");
		int yearOfBirthday = scanner.nextInt();
		
		
		// лесенка первого массива (знаки зодиака)
		if ((monthOfBirthday == 3 && dayOfBirthday >= 21) || (monthOfBirthday == 4 && dayOfBirthday <= 19)) {
			Zodiak = arrZodiak[0];	
		} 
		
		else if ((monthOfBirthday == 4 && dayOfBirthday >= 20) || (monthOfBirthday == 5 && dayOfBirthday <= 20)) {
			Zodiak = arrZodiak[1];
		}
		
		else if ((monthOfBirthday == 5 && dayOfBirthday >= 21) || (monthOfBirthday == 6 && dayOfBirthday <= 21)) {
			Zodiak = arrZodiak[2];
		}
		
		else if ((monthOfBirthday == 6 && dayOfBirthday >= 22) || (monthOfBirthday == 7 && dayOfBirthday <= 22)) {
			Zodiak = arrZodiak[3];
		}
		
		else if ((monthOfBirthday == 7 && dayOfBirthday >= 23) || (monthOfBirthday == 8 && dayOfBirthday <= 22)) {
			Zodiak = arrZodiak[4];
		}
		
		else if ((monthOfBirthday == 8 && dayOfBirthday >= 23) || (monthOfBirthday == 9 && dayOfBirthday <= 22)) {
			Zodiak = arrZodiak[5];
		}
		
		else if ((monthOfBirthday == 9 && dayOfBirthday >= 23) || (monthOfBirthday == 10 && dayOfBirthday <= 23)) {
			Zodiak = arrZodiak[6];
		}
		
		else if ((monthOfBirthday == 10 && dayOfBirthday >= 24) || (monthOfBirthday == 11 && dayOfBirthday <= 22)) {
			Zodiak = arrZodiak[7];
		}
		
		else if ((monthOfBirthday == 11 && dayOfBirthday >= 23) || (monthOfBirthday == 12 && dayOfBirthday <= 21)) {
			Zodiak = arrZodiak[8];
		}
		
		else if ((monthOfBirthday == 12 && dayOfBirthday >= 22) || (monthOfBirthday == 1 && dayOfBirthday <= 20)) {
			Zodiak = arrZodiak[9];
		}
		
		else if ((monthOfBirthday == 1 && dayOfBirthday >= 20) || (monthOfBirthday == 2 && dayOfBirthday <= 18)) {
			Zodiak = arrZodiak[10];
		}
		
		else if ((monthOfBirthday == 2 && dayOfBirthday >= 19) || (monthOfBirthday == 3 && dayOfBirthday <= 20)) {
			Zodiak = arrZodiak[11];
		}
		
		// лесенка второго массива (китайский календарь)
		if (yearOfBirthday % 12 == 4) {
			China = arrChina[0];
		}
		
		else if (yearOfBirthday % 12 == 5) {
			China = arrChina[1];
		}
		
		else if (yearOfBirthday % 12 == 6) {
			China = arrChina[2];
		}
		
		else if (yearOfBirthday % 12 == 7) {
			China = arrChina[3];
		}
		
		else if (yearOfBirthday % 12 == 8) {
			China = arrChina[4];
		}
		
		else if (yearOfBirthday % 12 == 9) {
			China = arrChina[5];
		}
		
		else if (yearOfBirthday % 12 == 10) {
			China = arrChina[6];
		}
		
		else if (yearOfBirthday % 12 == 11) {
			China = arrChina[7];
		}
		
		else if (yearOfBirthday % 12 == 0) {
			China = arrChina[8];
		}
		
		else if (yearOfBirthday % 12 == 1) {
			China = arrChina[9];
		}
		
		else if (yearOfBirthday % 12 == 2) {
			China = arrChina[10];
		}
		
		else if (yearOfBirthday % 12 == 3) {
			China = arrChina[11];
		}
		
		System.out.printf("%d %d %d\n", dayOfBirthday, monthOfBirthday, yearOfBirthday);
		System.out.println("Вывод: ");
		System.out.println("Знак: " + Zodiak);
		System.out.println("Год: " + China);
		
	}

}
