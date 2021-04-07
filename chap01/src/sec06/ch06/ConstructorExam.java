package sec06.ch06;

public class ConstructorExam {
	// 생성자
	//객체지향 언어는 모두 생성자를 사용한다
	//생성자는 객체가 만들어질 때 무조건 호출을 해야한다.
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 200;
		tv1.maxVolume = 100;
		tv1.displayState();
		
		Tv tv2 = new Tv("LG", 120, 300, 200);
		tv2.displayState();

//		tv.volumeUp();
//		tv.volumeUp();
//		tv.volumeUp();
//
//		tv.displayVolume(); // 현재 볼륨 : 3
	}

}
class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	//기본 생성자
	//생성자 vs 메소드
	//생성자(이름은 클래스명이랑 같다.)
	//리턴 타입이 없다(void int등 적지X)
	Tv(){}
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
	}
	//생성자는 객체 생성할 때만 사용할 수 있다.
	//우리가 적지 않으면 컴파일러가 자동으로 넣어줌(생성자가 하나도 없울 때)
	
	void volumeUp() {
		//int currentVolume = 0; 을 해주면 밑에 있는 식은 제일 가까운 아이를 올려줌 
		//그러면 기존 currentVolume은 올라가지 않고 0이 출력됨
		//대신 'this.'(자기 자신의 주소 값)을 적으면 해결가능 
		currentVolume += 1;//++
	}
	
	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n", brand, inch, maxChannel, maxVolume);
	}
}