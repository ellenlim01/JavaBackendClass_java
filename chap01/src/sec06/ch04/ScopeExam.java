package sec06.ch04;

public class ScopeExam {
	public static void main(String[] args) {
		// 스코프 (변수&상수가 살아있는 범위)

		int a = 10;
		int jjj = 11;
		if (a > 9) {
			System.out.println("a : " + a);

			jjj = 10;
			System.out.println(jjj);
		}
		System.out.println(jjj);

		for (int i = 0; i < 10; i++) {

		}
		for (int i = 0; i < 22; i++) {

		}
		if (true) {
			int i = 10;
		}
		if (true) {
			int i = 10;
		}
	}// 자신을 감싸고 있는 가장 가까운 {}안에서 살아있음
}// 출력 후 선언도 의미 없음
