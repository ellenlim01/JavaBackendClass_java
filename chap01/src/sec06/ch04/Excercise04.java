package sec06.ch04;

public class Excercise04 {
	public static void main(String[] args) {

		while (true) {
			int i = (int) (Math.random() * 6 + 1);
			int j = (int) (Math.random() * 6 + 1);
			System.out.printf("(%d, %d)\n", i, j);
			if (i + j == 5) {                                                                                                                                                                                                                                               
				break;
			}
		}
	}
}
