package sec06.ch04;

public class IfExam {
	public static void main(String [] args) {
		int score = 90;
		
		if (score >= 90) {//True이면 실행, False라면 무시
			System.out.println("score가 90보다 큽니다.");
			System.out.println("등급 A");
		}
		if (score < 90) {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("등급 B");
		}
		System.out.println("끝");
		
		System.out.println("---------------------------------");
		
		if (score >= 90) {//그룹으로 묶으면: 둘 중 하나는 무조건 실행됨. 둘 중 하나만 실행됨
			System.out.println("score가 90보다 큽니다.");
			System.out.println("등급 A");
		} else {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("등급 B");
		}
		System.out.println("끝2");
	}
}
