package sec06.ch05;

public class MethodExam {
	public static void main(String[] args) {// 메인 메소드
		// void: return type, main:메소드명, ()안에 있는 것: 파라미터(매개변수),{}:범위
		int aaa = 10;
		int result = sum(aaa, 20);// ()안에서 정의를 하면 안됨, 값만 보내야함
		System.out.println("result : " + result);

		result = minus(20, 10);
		System.out.println("minus-result : " + result);
	}// 메소드는 메소드 안에 있으면 안됨!!!
		// 메소드를 정의했다고 표현, {}앞은 선언부, 사용하는 것은 메소드를 호출했다고 표현

	public static int sum(int aaa, int b) {
		return aaa + b;// return하면 돌아가는데 그러면 result의 값이 30이 되는 것
	}

	public static int minus(int n1, int n2) {
		return n1 - n2;
	}

	public static String print() {
		return 1 + 1 + "";
	}
}
