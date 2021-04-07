package sec06.ch06;

public class CapsuleExam2 {
	public static void main(String[] args) {
		Human h1 = new Human();//생성자를 무조건 호출해야함
		Human h2 = new Human("평강공주");
		Human h3 = new Human(30);
		Human h4 = new Human("이순신", 20);
		
		h1.whoAmI2();
		h2.whoAmI2();
		h3.whoAmI2();
		h4.whoAmI2();
		
		// 임지영 바보
	}
}
