package sec06.ch05;

public class MethodMission3 {
	public static void main(String[] args) {
		sumAllFromTo(5, 10);
		sumAllFromTo(2, 4);
		sumAllFromTo(1, 100);
		sumAllFromTo(4, 2);// 9
	}

	public static void sumAllFromTo(int a, int b) {
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int sum = (b * (b + 1) / 2) - ((a - 1) * a / 2);

//		int sum = 0;
//		for (int i = a; i <= b; i++) {
//			sum += i;
//		}
//		for (int i = a; i >= b; i--) {
//			sum += i;
//		}
		System.out.println("sum = " + sum);

	}
}