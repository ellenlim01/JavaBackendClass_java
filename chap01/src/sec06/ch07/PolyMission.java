package sec06.ch07;

public class PolyMission {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
		
		//Bus, Local Bus openDoor 메소드 호출
		//그 외에는 hoot
		blowKlaxon(car1);
		blowKlaxon(car2);
		blowKlaxon(car3);
		blowKlaxon(car4);
		
	}
	public static void blowKlaxon(Car a) {
		if(a instanceof Bus) {
//			Bus bus = (Bus) a;
//			bus.openDoor();
			((Bus) a).openDoor();
		} else {
			a.hoot();
		}//return이 있으면 else를 쓰지 않아도 됨36
	}
}
