package sec06.ch04;

public class ForMission4 {
	public static void main(String[] args) {
		int dan = (int) (Math.random() * 8) + 2;
		// 2~9 사이의 랜덤 값
		// dan=2이면 2*9=18까지 출력

		for (int i = 6; i < 15; i++) {
			int j = i - 5;
			int result = dan * j;
			System.out.printf("%d * %d = %d\n", dan, j, result);
		}
	}
}
