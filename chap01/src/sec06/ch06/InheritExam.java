package sec06.ch06;

public class InheritExam {
	public static void main(String[] args) {
	    Cat cat = new Cat();
		cat.howling();
		// cat.pee(); cat은 KShort의 존재 자체도 모름
		// 생성자 호출은 Cat에서 시작함
		KoShort ks = new KoShort("호두", 4);
		ks.lick();


	}
}

class Animal extends Object {// 모든 자바의 객체들은 무조건 Object로부터 상속 받게 됨, 생략해도 컴파일러가 자동으로 넣어줌
	String name;
	int age;
	Animal(){}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void howling() {
		System.out.println("운다");
	}
}

class Cat extends Animal {//다중 상속 안됨!
	Cat(){}
	Cat(String name, int age) {
		super(name, age);// 바로 위에 있는 부모를 뜻함, super가 가장 위에 있어야 함, 부모의 기본 생성자를 호출한 것
	}

	void lick() {
		System.out.printf("%s가 햝다.\n", name);
	}
	@Override//덮어쓰기의 개념
	void howling() {
		System.out.println("야옹");
	}
}

class KoShort extends Cat { // 위의 Cat, Animal의 내용들을 모두 상속받음
	KoShort(String name, int age) {
		super(name, age);
		System.out.println("KoShort 생성자");
	}
	void pee() {
		System.out.printf("%s가 소변을 본다.\n", name);
	}
}