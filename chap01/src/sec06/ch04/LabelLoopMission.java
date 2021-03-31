package sec06.ch04;

public class LabelLoopMission {
	public static void main(String[] args) {
		// n1, n2값이 8이 되면 모든 for 종료
		// n1, n2값이 같아지면 n1값을 올린다.
		OUTER: for (int n1 = 1; n1 < 9; n1++) {

			for (int n2 = 0; n2 <= 9; n2++) {
				if (n1 == n2) {
					break;
				} else if (n1 == 8 && n2 == 8) {
					break OUTER;
				}
				System.out.printf("%d%d\n", n1, n2);
			}
			System.out.println();
		}
		System.out.println("끝!");
	}
}
