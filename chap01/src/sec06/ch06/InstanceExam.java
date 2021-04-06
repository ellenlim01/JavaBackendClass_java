package sec06.ch06;//.이 2개정도는 들어가줘야함, 소문자만 사용, 패키지명: 'com.naver.패키지명.클래스명'

public class InstanceExam {

	public static void main(String[] args) {
		Dog d1 = new Dog(); //aaa는 변수명. new:객체화를 시켜주는 키워드, 주소 값이 들아가서 소멸되지 않음
		Dog d2 = new Dog(); //같은 Dog의 구조를 갖고 있지만 완전히 다른 존재, 다른 주소값을 가져 다른 값을 저장 가능
		//그 주소값은 d1에 들어감, 대문자로 시작하는 것은 참조형변수(여기에 null이 안들어가 있으면 무조건 주소값이 들어있음) Dog는 변수의 타입
		//new Dog(); 한번 쓰고 소멸됨
		//주소값(변수명). -> 가지고 있는 멤버 필드와 멤버 메소드에 접근 가능
		d1.name = "뽀삐";
		d2.name = "돌쇠";
		d1.bark();
		d2.bark();
	}
}
//멤버필드(값을 저장할 수 있는 것) - 명사담당, 
//멤버 메소드(값을 수정할 수 있는 것) - 동사담당
class Dog {//설계도
	String name;
	String breed;
	int age;
	
	void bark() {//public과 static을 붙이지X
		System.out.printf("%s가 멍멍\n", name);
	}
}//앞에 public을 붙일 수 없음
//이름이 있거나 경계가 있으면 모두 객체