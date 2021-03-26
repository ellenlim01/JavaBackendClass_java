package sec06.ch04;

public class IfMission {

	public static void main(String [] args) {
		int score = 90;
		
		if(score < 70) {
			System.out.println("M 등급 D");
		} else if(score < 80) {
			System.out.println("M 등급 C");
		} else if(score < 90) {
			System.out.println("M 등급 B");
		} else {
			System.out.println("M 등급 A");
		} 
		System.out.println("끝");
	}
}
