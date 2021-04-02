package sec06.ch05;

public class MethodMission4 {
	public static void main(String[] args) {
		int rNum = getRandomNum();// 0~9()가 비어있으면 메소드 작성시에도 쓰지말 것
		System.out.println("rNum : " + rNum);

		int max1 = 20;
		rNum = getRandomNum(max1);// 0~19
		System.out.println("rNum : " + rNum);

		rNum = getRandomNum(5, 10);//5~10
		System.out.println("rNum : " + rNum);
		rNum = getRandomNum(10, 20);
		System.out.println("rNum : " + rNum);
	}

	public static int getRandomNum(int min, int max) {
		return (int) (Math.random() * (max-min+1) + min);
	}
	
	public static int getRandomNum() {// return 옆에 무조건 int형 적어야 함
		return (int) (Math.random() * 10);
	}

	public static int getRandomNum(int max2) {// 이름을 맞출 필요는 없다, type이 중요
		return (int) (Math.random() * max2);// dynamic하다
	}
}
