package sec06.ch04;

import java.util.Scanner;

public class Excercise7 {
	public static void main(String[] agrs) {
		boolean run = true;

		int balance = 0;//잔고

		Scanner scan = new Scanner(System.in);
		MAIN:
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("예금액> ");
				int money = scan.nextInt();
				balance += money;
				break;
			case 2:
				System.out.print("출금액> ");
				int money2 = scan.nextInt();
				if (money2 > balance) {
					System.out.println("\"잔고가 부족합니다\"");
					balance += money2;
				}
				balance -= money2;
				break;
			case 3:
				System.out.printf("잔고> %d\n", balance);
				break;
			case 4:
				break MAIN;
			}
		}
		System.out.println("프로그램 종료");
	}
}
