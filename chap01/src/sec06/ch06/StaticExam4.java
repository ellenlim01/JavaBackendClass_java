package sec06.ch06;

public class StaticExam4 {
	public static void main(String[] args) {
		CalcInstance2 cal = new CalcInstance2();
		cal.num1 = 10;
		cal.num2 =20;
		int result = cal.sum();
		System.out.println("num1 + num2 : " + result);
		String.format("%d", result);
		result = CalcStatic2.sum(10, 20);
		System.out.println(result);
		
	}
}
class CalcStatic2 {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance2 {
	static int num1;
	static int num2; //메소드 안에 없으면 전역변수
	int sum() {
		return num1 + num2;
	}
	static int sum(int num1, int num2) {//지역변수 전역변수 이름이 같을 수는 있음. 가장 가까운 아이 사용
		return num1 + num2;//여기서 this를 쓸 수 없음
	}
}
//static이 붙은 아이가 먼저 올라감
//파라미터로 들어온 것만으로 처리를한다면 static을 붙임