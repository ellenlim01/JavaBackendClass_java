package sec06.ch04;

public class ForMission8 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5 + 3);
		System.out.println("star : " + star);

		/*for (int i = star; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		for(int i=star; i>0; i--) {
			for(int z=0; z<i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
