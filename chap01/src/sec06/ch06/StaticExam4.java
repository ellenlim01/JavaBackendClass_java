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
	static int num2; 
	int sum() {
		return num1 + num2;
	}
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}
//static이 붙은 아이가 먼저 올라감
//파라미터로 들어온 것만으로 처리를한다면 static을 붙임