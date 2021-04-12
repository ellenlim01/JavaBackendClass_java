package sec06.ch07;

public class PolyExam2 {

	public static void main(String[] args) {
		Car car1 = new LocalBus();
		
		LocalBus lb1 = (LocalBus)car1;
		
		System.out.println(car1 instanceof LocalBus);
		Bus bus1 = (Bus)car1;
		System.out.println(car1 instanceof Bus);//Object와 비교하면 뭐든지 true
		
		System.out.println("---------------");
		
		Car car2 = new Bus();
		System.out.println(car2 instanceof LocalBus);
		//car2가 LocalBus로 형변환이 가능한가?
		//LocalBus가 자식이기 때문에 불가능
		
		System.out.println("---------------");
		
		Car car3 = new Truck();
		System.out.println(car3 instanceof Bus);
		
	}

}
