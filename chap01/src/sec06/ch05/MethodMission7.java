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

	public static String chk(String gender, int height) {
//		String result = "평균";
//		if (gender.equals("남")) {
//			int manStand = 175;
//			if (height < manStand) {
//				result = "평균 미만";
//			} else if (height > manStand) {
//				result = "평균 초과";
//			}
//		} else if (gender.equals("여")) {
//			int womanStand = 163;
//			if (height < womanStand) {
//				result = "평균 미만";
//			} else if (height > womanStand) {
//				result = "평균 초과";
//			}
//		}
		int stand = 0;
		String result = "평균";

		switch (gender) {
		case "여": case "여자":
			stand = 163;
			break;
		case "남": case "남자":
			stand = 175;
			break;
		default:
			return "성별을 잘 못 입력하셨습니다.";
		}

		if (height > stand) {
			result = "평균 초과";
		} else if (height < stand) {
			result = "평균 미만";
		}
		return String.format("성별: %s, 키: %dcm, %s", gender, height, result);
		// System.out.printf();를 쓰면 return이 아닌 콘솔에 찍는 것을 목표로 함
		// return "성별: "+ gender + ", 키: " + height + "cm, " + result;
	}
}
