package sec06.ch04;

public class SwithExam2 {
	public static void main(String[] args) {
		String habbit = "수영";
		
		switch(habbit) {//문자열 분류할 때는 switch가 더 편리
		case "수영": case "등산":
			System.out.println("건강한 취미입니다.");
			break;
		case"술": case"담배":
			System.out.println("비건전한 취미입니다.");
			break;
		}
	}
}
