package sec06.ch04;

public class IfMission2Another2 {
	public static void main(String[] args) {
	
		String gender = "여자";
		int height = 100;
		
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = MAN_STAND;
		
		if (gender.equals("여")) {
			stand = WOMAN_STAND;
		} 
		
		if (height < stand) {
			System.out.printf(" %s, 평균 미만", gender);
		} else if (height == stand) {
			System.out.printf(" %s, 평균", gender);
		} else {
			System.out.printf(" %s, 평균 초과", gender);
		}
	}
}
