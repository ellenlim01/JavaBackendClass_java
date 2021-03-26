package sec06.ch03;

public class OperatorExam {
	public static void main(String[] args) {
		//산술연산자
		int n1 = 10;
		int n2 =3;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);//여기서부터 문자 섞이면 에러
		System.out.println(n1 / n2);//int/int는 int 따라서 값이 3
		System.out.println((float)n1 / n2);//왜 한개만 float를 줘도 되는가?
		System.out.println(n1 * n2);
		float result = n1 / n2;
		System.out.println("result : " + result);
		System.out.println(n1 * n2);
		
		System.out.println("-----------------");
		int result2 = 3 + 4 + 5 * 6;//()가 가장 우선순위가 높음
		System.out.println("result2: " + result2);
		
		int mod = 10 % 4;
		System.out.println("mod : " + mod);
		
		int odd = 3 % 2;
		int even = 4 % 2;
		System.out.println("odd : " + odd);//결과값: 1
		System.out.println("even : " + even);//결과값: 0
		
		//단항 연산자
		int n3 = 1;
		System.out.println("n3 : " + -n3);
		
	}
}
