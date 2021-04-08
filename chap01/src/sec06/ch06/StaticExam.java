package sec06.ch06;

public class StaticExam {
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "Disney";
		System.out.println("t1.name : " + t1.name);
		t2.name = "Lotte";
		
		Toy.name = "SOC";;
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name);
		System.out.println("Toy name : " + Toy.name);//주소값/클래스명으로 접근 가능
	}
}

class Toy {
	static String name;//하나의 값만 저장 가능
	//static이 붙은 아이와 안붙은 아이는 완전히 다른 존재, 객체화와는 전혀 상관 업쇼
}