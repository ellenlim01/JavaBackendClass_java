package sec06.ch06;

public class StaticExam2 {

	public static void main(String[] args) {
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();

		System.out.println("장난감 생산 갯수 : " + Toy2.makeCount);
	}

}

class Toy2 {
	static int makeCount;
	
	Toy2() {
		makeCount++;
	}
}