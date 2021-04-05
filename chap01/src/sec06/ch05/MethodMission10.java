package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuArr = { "콜라", "사이다", "환타", "스프라이크", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		printMenu(menuArr, menuPriceArr);
		printMenu2(menuArr, menuPriceArr);
	}
	
	public static void printMenu2(String[] menuArr, int[] menuPriceArr) {
		String str = "<메뉴>\n";
		for (int i=0; i<menuArr.length; i++) {
			str += String.format("%d. %s (%,d원)\n", i + 1, menuArr[i], menuPriceArr[i]);
		}
		System.out.println(str);
	}

	public static void printMenu(String[] menuArr, int[] menuPriceArr) {
		System.out.println("<메뉴>");
		for (int i = 0; i < menuArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i + 1, menuArr[i], menuPriceArr[i]);
		}
	}
}
