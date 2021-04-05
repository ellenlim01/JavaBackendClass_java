package sec06.ch05;

public class MethodMission5 {

	// 중복된 소스 최대한 제거, 메소드 재활용!!

	public static void printStarLine(int a) {
		for (int i = 0; i < a; i++) {
			System.out.print("*");
		}
	}

	public static void printStarSquare(int b) {
		for (int i = 0; i < b; i++) {
			printStarLine(b);
			System.out.println();
		}
	}

	public static void printStarTri(int c) {
		for (int i = 1; i <= c; i++) {
			printStarLine(i);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int star = 5;
		printStarTri(star);
		System.out.println();
		// *
		// **
		// ***
		// ****
		// *****
		star = 3;
		printStarTri(star);
	}
}
