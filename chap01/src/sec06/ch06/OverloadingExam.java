package sec06.ch06;

public class OverloadingExam {
	// 똑같은 이름의 메소드를 여러개 만들 수 있음
	// 리턴 타입과 관계 없이 파라미터가 달라야 함
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(5, 10);
		calc.sum(5, 10, "30");
	}

}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}

	void sum(int n1, int n2, String n3) {
		System.out.println(n1 + n2 + n3);
	}
}