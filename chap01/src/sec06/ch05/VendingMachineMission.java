package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 아래는 출력해야하는 내용 <메뉴> 0. 종료 1. 콜라(1,000원) 2. 사이다(1,200원) 3. 환타(1,300원)
		 * 
		 */

		String[] menuArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000 };
		int balance = 0;
		int money =0;
		while (true) {

			System.out.println("<메뉴>");
			System.out.println("0. 종료");
			for (int i = 0; i < menuArr.length; i++) {
				System.out.printf("%d. %s (%,d원)\n", i + 1, menuArr[i], menuPriceArr[i]);
			}
			{
				System.out.print("금액 > ");
				money = scan.nextInt();
				System.out.print("선택 > ");
				int choice = scan.nextInt();
				if (money < menuPriceArr[choice - 1]) {
					System.out.println("금액이 부족합니다.\n");
					continue;
				}
				if (choice == 0) {
					break;
				} else if (choice >= 1 && choice <= menuArr.length) {
					System.out.printf("%s를 선택하셨습니다.\n", menuArr[choice - 1]);
					balance += menuPriceArr[choice];
					money -= menuPriceArr[choice];
				} else {
					System.out.println("잘 못 선택하셨습니다.");
				}
				System.out.println();
			}
		}
		System.out.printf("종료\n 사용한 금액: %,d원\n 남은 금액: %d", balance, money);
		scan.close();

	}
}
