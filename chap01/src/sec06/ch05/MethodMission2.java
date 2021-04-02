package sec06.ch05;

public class MethodMission2 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		double result = divide(n1, n2);
		System.out.println("result : " + result);// 3.333

		n1 = 10;
		n2 = 5;
		result = divide(n1, n2);
		System.out.println("result : " + result);// 2.0

		System.out.println("절대값: " + abs(10));// 10
		System.out.println("절대값: " + abs(-10));// 10
		System.out.println("절대값: " + abs(7));// 7
		System.out.println("절대값: " + abs(-7));// 7
	}

	public static int abs(int a) {
		if (a < 0) {
			a *= (-1);
		}
		return a;
	}

	public static double divide(int n1, int n2) {
		return (double) n1 / n2;
	}
}
