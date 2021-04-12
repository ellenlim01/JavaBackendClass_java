package sec06.ch07;

public class PolyExam {
	/*
	1. 부모타입은 자식객체의 주소 값을 참조, 저장할 수 있다. (가리킬 수 있다.)
	2. 자식타입은 부모객체 주소 값을 참조할 수 없다.
	3. 변수타입은 메소드 호출 여부만 결정
		(자기가 아는 것만 호출 가능)
		
*/
	public static void main(String[] args) {
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus();
		
		Bus bus1 = (Bus)car1;
//		Bus car4 = (Bus)new Car();
//		bus1.openDoor
		//형변환을 해도 에러가 절대 안됨
		bus1.hoot();//객체기준으로 봐야 함
		car3.hoot();
		
		Car carP2 = new Truck();
		Truck truck1 = (Truck)carP2;
		Car carP3 = truck1;
		carP3.hoot();
		System.out.println("------------------");

		Car carP4 = new LocalBus();
		Bus bus2 = (Bus)carP4;
		LocalBus lb = (LocalBus)bus2;
		lb.hoot();//런타임에러
		
		
		System.out.println("끝!");
	}
}
