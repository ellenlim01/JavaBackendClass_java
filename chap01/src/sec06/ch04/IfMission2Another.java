package sec06.ch04;

public class IfMission2Another {
	public static void main(String[] args) {
		String gender = "여";
		int height = 160;

		String displayGender = "여자", displayResult = "평균";
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = WOMAN_STAND;

		if (gender.equals("남")) {
			stand = MAN_STAND;
			displayGender = "남자";
		}
		
		if (height < stand) {
			displayResult = "평균 미만";
		} else {
			displayResult = "평균 초과";
		}
		System.out.printf("%s - %dcm : %s\n", 
				displayGender, height, displayResult);

	}
}