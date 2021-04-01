package sec06.ch04;

import java.util.Scanner;

public class VendingMachineMission2 {
	public static void main(String[] args) {

		// 지금까지 구매한 제품 가격 표시
		Scanner scan = new Scanner(System.in);
		String[] menuArray = { "콜라", "사이다", "환타" };
		int[] menuPriceArray = { 1000, 1200, 1300 };

		System.out.println("<메뉴>");
		System.out.println("0. 종료");
		int usePrice = 0;
		for (int i = 0; i < menuArray.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", (i + 1), menuArray[i], menuPriceArray[i]);
		}
		while (true) {
			System.out.print("선택 > ");
			int choice = scan.nextInt();
			if(choice == 0) {
				break;
			} else if (choice>0 && choice <=menuArray.length) {
				int selectedIdx = choice-1;
				System.out.printf("%s를 선택하셨습니다.\n", menuArray[selectedIdx]);
				usePrice += menuPriceArray[selectedIdx];
			} else {
				System.out.println("잘 못 선택하셨습니다.");
			}
			System.out.println();
		}
		System.out.printf("종료 - 사용한 금액은 : %,d원", usePrice);
	}
}
