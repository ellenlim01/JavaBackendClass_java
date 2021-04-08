package sec06.ch06;

public class StaticExam2 {

	public static void main(String[] args) {
		Toy2.makeCount = 10;
		Toy2 t1 = new Toy2();
		
		System.out.println("Toy2 : " + Toy2.makeCount);
		System.out.println("Toy3 : " + Toy3.makeCount);
	}

}
class Toy3 {
	static int makeCount =0;
}
class Toy2 {
	static int makeCount =0;//class명. 으로 접근
	
	Toy2() {
		makeCount++;//같은 클래스 안에 있을 경우 앞에 아무것도 안붙여도 가능
	}
}