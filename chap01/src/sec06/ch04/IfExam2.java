package sec06.ch04;

public class IfExam2 {

	public static void main(String[] args) {
		int score = 90;
		
		if(score >= 90) {//순서가 중요! 가장 먼저 만난 True를 만나고 빠져나감
			System.out.println("등급 A");//90~
		} else if(score >= 80) {
			System.out.println("등급 B");//80~89
		} else if(score >= 70) {
			System.out.println("등급 C");//70~79
		} else { //~69
			System.out.println("등급 D");
		}
		System.out.println("끝");
	}
}
