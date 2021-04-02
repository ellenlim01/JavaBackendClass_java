package sec06.ch05;

public class MethodMission {
	public static void main(String[] args) {
		whoIsBig(10, 30);// 콘솔 100이 가장 큽니다
		whoIsBig(10, 9);
		whoIsBig(11, 25);

		int big = getBigNum(10, 30);
		System.out.println("big : " + big);

		big = getBigNum(10, 9);
		System.out.println("big : " + big);
	}

	public static int getBigNum(int n1, int n2) {
		if (n1 < n2) {
			return n2;
		}
		return n1;
	}

	public static void whoIsBig(int a, int b) {
		int big = a;
		if (a < b) {
			big = b;
		}
		System.out.printf("%d이 가장 큽니다.\n", big);
	}
}
