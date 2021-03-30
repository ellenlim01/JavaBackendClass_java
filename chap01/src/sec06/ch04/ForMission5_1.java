package sec06.ch04;

public class ForMission5_1 {
	public static void main(String[] args) {
		// 2*1=2 3*1=3 ....9*1=9
		// 2*2=4 3*2=6 ....9*2=18

		// 2*9=18 3*9=17 ....9*9=81

		for (int i = 1; i < 10; i++) {
			for (int z = 2; z < 10; z++) {
				int j = i * z;
				System.out.printf("%d * %d = %d\t", z, i, j);
			}
			System.out.println();
		}
	}
}
