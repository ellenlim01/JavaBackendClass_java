package sec06.ch05;

public class MethodMission6 {

	public static int getRandomScore(int a, int b) {
		return (int) (Math.random() * (b - a + 1) + a);
	}

	public static char getGrade(int score) {
		switch(score/10) {
		case 10: case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		}
		return 'E';
	}

	public static char getGradeSign(int score) {
		char grade2 = '+';
		int restVal = score % 10;
		if (restVal > 3 && restVal < 7) {
			grade2 = ' ';
		} else if (restVal <= 3 && restVal >= 0 && score / 10 != 10) {
			grade2 = '-';
		}
		return grade2;
//		int mod = score % 10;
//		if(score == 100 || mod >= 8) {
//			return '+';
//		} else if (mod <= 3) {
//			return '-';
//		}
//		return ' ';
	}

	public static void main(String[] agrs) {
		int score = getRandomScore(50, 100);

		char grade = getGrade(score);
		// 90점 이상 A
		// 80점 이상 B
		// 70점 이상 C
		// 60점 이상 D
		// 나머지 E
		char grade2 = getGradeSign(score);
		// ?8 이상이거나 100점이면 +
		// ?3 이하이면 -
		// 나머지 빈칸이 리턴 되도록
		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}
}
