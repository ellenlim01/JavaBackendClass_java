package sec06.ch07;

public class Car {
	public void hoot() {
		System.out.println("빵!빵!");
	}
}
class Bus extends Car {
	public void openDoor() {
		System.out.println("승객문을 열다.");
	}

}
class LocalBus extends Bus {

}
class Truck extends Car {
	@Override
	public void hoot() {
		System.out.println("Truck 빵!빵!");
	}

}