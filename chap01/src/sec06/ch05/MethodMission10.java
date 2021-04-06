package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] menuArr = { "콜라", "사이다", "환타", "스프라이크", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };
				
		Drink[] drinkArr = new Drink[6];
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = new Drink();
			drink.nm = menuArr[i];
			drink.price = menuPriceArr[i];
			
			drinkArr[i] = drink;
		}
		
		for(int i=0; i<drinkArr.length; i++) {
			System.out.println(drinkArr[i].nm);
		}
		
		//Drink drink = new; 각 방은 드링크 타입, 드링크 주소 값만 들어감
		

		printMenu(menuArr, menuPriceArr);
		boolean run = true;
		while(run) {
			System.out.print("선택 > ");
			
		}

	}

	public static void printMenu2(String[] menuArr, int[] menuPriceArr) {
		String str = "<메뉴>\n";
		str += "0. 종료";
		for (int i = 0; i < menuArr.length; i++) {
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
