package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	// 남자 평균키175, 여자 평균키 163
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		do {
			System.out.print("성별 : ");
			String gender = scan.next();

			System.out.print("키 : ");
			int height = scan.nextInt();

			String result = chk(gender, height);
			System.out.println(result);
			// 성별: 남, 키: 170cm, 평균 미만

			System.out.print("계속 하시겠습니까? (y, n): ");
			answer = scan.next();

		} while (answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}

	public static String chk(String a, int b) {
		String result = "평균";
		if (a.equals("남")) {
			int manStand = 175;
			if (b < manStand) {
				result = "평균 미만";
			} else if (b > manStand) {
				result = "평균 초과";
			}
		} else if (a.equals("여")) {
			int womanStand = 163;
			if (b < womanStand) {
				result = "평균 미만";
			} else if (b > womanStand) {
				result = "평균 초과";
			}
		}
		return ("성별: "+ a + ", 키: " + b + ", " + result);

	}
}
