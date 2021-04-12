package sec06.ch07;

public abstract class Animal {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void howling();//선언구만 있는 메소드를 추상 메소드라고 함
	public void breath() {
		System.out.println("숨쉰다");
	}
	//둘 다 존재할 수 있는 건 abstract, 선언구만 있는 건 인터페이스
}
//무조건 오버라이딩 해야 함 
abstract class Cat extends Animal {
}

class Dog extends Animal {
	@Override
	public void howling() {
		System.out.println("머엉머엉");
	};
}