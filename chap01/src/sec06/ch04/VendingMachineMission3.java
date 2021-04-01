package sec06.ch04;

import java.util.Scanner;

public class VendingMachineMission3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuArray = { "콜라", "사이다", "환타" };
		int[] menuPriceArray = { 1000, 1200, 1300 };

		System.out.println("<메뉴>");
		System.out.println("0. 종료");
		for (int i = 0; i < menuArray.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", (i + 1), menuArray[i], menuPriceArray[i]);
		}
		System.out.print("돈을 주입해 주세요 : ");
		int balance = scan.nextInt();

		while (true) {
			System.out.print("선택 > ");
			int choice = scan.nextInt();
			if (choice == 0) {
				break;
			} else if (choice > 0 && choice <= menuArray.length) {
				int selectedIdx = choice - 1;
				if (balance < menuPriceArray[selectedIdx]) {
					System.out.printf("금액이 부족합니다. (남은 금액 %,d원)\n\n", balance);
					continue;
				} 
				balance -= menuPriceArray[selectedIdx];
				System.out.printf("%s를 선택하셨습니다. (남은 금액 %,d원)\n", menuArray[selectedIdx], balance);
			} else {
				System.out.println("잘 못 선택하셨습니다.");
			}
			System.out.println();
		}
//		System.out.printf("종료 - 남은 금액 : %,d원", balance);
//		
//		while(run) {
//			System.out.print("선택 > ");
//			int choice = scan.nextInt();
//			if (choice < 0 || choice> menuArray.length) {
//				System.out.println("잘못");
//				continue;
//			}
//			int selectedId = choice-1;
//			if(choice ==0) {
//				run = false;
//				
//			}
//		}
	}

}
