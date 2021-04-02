package sec06.ch05;

public class MethodMission {
	public static void main(String[] args) {
		whoIsBig(10, 30);// 콘솔 100이 가장 큽니다

		whoIsBig(10, 9);

		whoIsBig(11, 25);
	}

	public static void whoIsBig(int a, int b) {
		int result = a;
		if (a < b) {
			result = b;
		}
		System.out.printf("%d이 가장 큽니다.\n", result);
	}
}
 