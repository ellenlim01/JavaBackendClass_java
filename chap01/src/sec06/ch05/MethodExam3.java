package sec06.ch05;

public class MethodExam3 {
	public static void main(String[] args) {
		int mon = 3;
		printSeason(mon);
	}

	public static void printSeason(int mon) {
		switch (mon) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			return; //void일 때는 필요시 return만 써야하지 그 옆에 값을 적으면 안된다
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			return;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			return;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			return;
		}
		System.out.println("잘 못 입력하셨습니다.");
	}
}
