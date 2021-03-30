package sec06.ch04;

public class WhileMission2_1 {
	public static void main(String[] args) {
		int sum = 0;
		while (true) {
			int val = (int) (Math.random() * 11);
			System.out.println("val: " + val);
			if (val == 0) {
				break;
			}
			sum += val;
		}
		System.out.println("sum : " + sum);
	}
}
