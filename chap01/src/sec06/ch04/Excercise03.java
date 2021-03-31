package sec06.ch04;

public class Excercise03 {
	public static void main(String[] agrs) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.printf("3의 배수의 합: %d", sum);
	}
}
