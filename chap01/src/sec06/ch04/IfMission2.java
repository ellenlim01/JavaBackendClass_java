package sec06.ch04;

public class IfMission2 {
	// 남자 평균 키 175, 여자 평균 키 163
	// 남 174 평균 미만
	// 남 175 평균
	// 남 176 평균 초과
	// 여 162 평균 미만
	// 여 163 평균
	// 여 164 평균초과

	public static void main(String[] args) {
		String gender = "모름";
		int height = 164;

		if (gender.equals("남")) {
			if (height < 175) {
				System.out.println("평균 미만");
			} else if (height == 175) {
				System.out.println("평균");
			} else {
				System.out.println("평균 초과");
			}
		} else if (gender.equals("여")) {
			if (height < 163) {
				System.out.println("평균 미만");
			} else if (height == 163) {
				System.out.println("평균");
			} else {
				System.out.println("평균 초과");
			}
		} else {
			System.out.println("측정 불가");
		}

	}
}
