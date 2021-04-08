package sec06.ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		h1.setName("홍길동");
		h1.setAge(12);
		h2.setName("신사임당");
		h2.setAge(20);

		h1.whoAmI();
		h2.whoAmI();
	}
}
//private한 멤버 필드에 값을 넣는 방법
//(쓰기)메소드 setter, 생성자)
//(읽기)메소드 getter
//생성자와 getter만 있고 setter가 없으면 한번 값을 준 이후로 바꿀 수 없음(final이 없다고 해도)
//생성자 v.s. 메소드) 생성자 이름 = 클래스 이름, 리턴 타입이 없음

class Human {
	private int age;
	private String name;
	private final int MAX_AGE = 100;//내부용, 값을 바꿀 수 없음

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %s살입니다.\n", getName(), getAge());
	}

	Human() {
		this(10);//생성자 호출
	}

	Human(String name) {
		this(name, 10);
	}

	Human(int age) {
		this("미상", age);
	}

	Human(String name, int age) {
		this.name = name;//멤버 필드/메소드 호출
		this.age = age;
	}

	public void whoAmI2() {
		System.out.printf("name: %s, age: %d\n", name, age);
	}
	// 생성자!!
	// 메소드!! setter, getter, 무조건 void

}