package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();//다르다는 것은 100% 상속관계
		//새롭게 햄스터 객체 만들지 않고 hamster 변수에 저장된 주소값을 활용하여 runRail 메소드 호출
		Hamster ham = (Hamster) hamster;
		ham.runRail();

		
		System.out.println(hamster instanceof Hamster);//true
		System.out.println(pig instanceof Hamster);//상속관계일 때만 사용하는 것
		//hamster.runRail();
		// PolymorMission pm = new PolymorMission();
		PolymorMission.cry(cat);// 내부에 있기 때문에 생략 가능함
		cry(pig);
		System.out.println("-------");
		cry(hamster);
	}// 형변환은 상속관계에서만 가능함
	//ani로 Hamster 객체 주소값이 들어오면 howling 메소드 말고 runRail 메소드 호출
	//다른 객체들은 howling 메소드 호출
	static void cry(Animal ani) {
		if(ani instanceof Hamster) {
			Hamster ani2= (Hamster) ani;
			ani2.runRail();
		} else {
			ani.howling();
		}
	}
}
class Hamster extends Animal {
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
	
}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~꿀~");
	}
}

