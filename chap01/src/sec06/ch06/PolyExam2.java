package sec06.ch06;

public class PolyExam2 {
/*
	1. 부모타입은 자식객체의 주소 값을 참조할 수 있다. (가리킬 수 있다.)
	2. 자식타입은 부모객체 주소 값을 참조할 수 없다.
*/
	public static void main(String[] args) {
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal();
		//Animal ani3 = new String();
		Hamster ham = (Hamster)ani2;//부모타입의 주소값을 자식타입으로 강제로 형변환도 불가 run type error
		Hamster ham2 = (Hamster)ani1;//이때는 error 터지지 않음
		System.out.println("끝");
	}

}
