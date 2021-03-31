package sec06.ch04;

import java.util.Scanner;

public class PracticeScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speed = 0;
		System.out.println("-------------------");
		System.out.println("1.증속| 2. 감속 | 3. 중지");
		System.out.println("-------------------");

		while (true) {
			System.out.print("선택: ");
			int inputVal = scan.nextInt();

			if (inputVal == 1) {
				speed++;
			} else if (inputVal == 2) {
				speed--;
			} else if (inputVal == 3) {
				break;
			} else {
				System.out.println("1,2,3번만 입력하세요.");
				continue;
			}
			System.out.println("현재 속도: " + speed);
		}
	}
}
