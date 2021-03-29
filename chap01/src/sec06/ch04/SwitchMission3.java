package sec06.ch04;

public class SwitchMission3 {
	public static void main(String [] args) {
		int season = (int)(Math.random() * 12) + 1;//*한 숫자-1까지 나오게됨 0~11까지 나오게 됨 이에 +1처리를 해준 것
		String result = "봄";
		//Math.random() 메소드 이용해 1~12범위만 나오게 처리
		//season값이 
		//3~5 봄
		//6~8 여름
		//9~11 가을
		//12, 1,2 겨울
		
		System.out.println("season : " + season);
		switch (season) {
		case 6: case 7: case 8:
			result = "여름";
			break;
		case 9: case 10: case 11:
			result = "가을";
			break;	
		case 12: case 1: case 2:
			result = "겨울";
		}	
		System.out.printf("%s", result);
		
		/*switch (season) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}*/
	}
}
