package sec06.ch06;

public class PolymorExam {
	public static void main(String[] args) {
		//1.부모 타입의 변수는 자식 객체를 가리킬 수 있다
		//2.자식 타입의 변수는 브모 객체를 가리킬 수 있다
		//자신의 타입이 자신의 객체를 가리킬 수 있다.
		//타입은 아는 메소드만 호출할 수 있다.
		//호출이 되었다면 기준은 객체이다.
		Animal ani_1 = new Cat();//(Animal)이 붙어서 자동형변환이 일어남
		//Cat cat1 = new Animal();불가능(컴파일 에러)
		Cat cat = (Cat)ani_1;//강제형변환을 시킨 것
		Animal ani_2 = cat;//자식이 부모보다 더 많은 메소드를 알 가능성이 높음
		
		ani_1.howling();//실제 실행되는 건 객체 기준으로 실행됨
		cat.howling();
		cat.lick();
		//ani_1.lick();
		
		//Cat cat1 = (Cat)new Animal("", 0); 강제로 형변환을 해도 에러 터짐(2)
		
		System.out.println("끝!");
	}
}
