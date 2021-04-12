package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		// PolymorMission pm = new PolymorMission();
		PolymorMission.cry(cat);// 내부에 있기 때문에 생략 가능함
		cry(pig);
		cry(hamster);
	}// 형변환은 상속관계에서만 가능함

	static void cry(Animal name) {
		name.howling();
	}
}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~꿀~");
	}
}

class Hamster extends Animal {
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}

}
