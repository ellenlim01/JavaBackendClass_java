package sec06.ch03;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2); // = or +
		boolean result4 = (num1 < num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		System.out.println("result4=" + result4);
		
		System.out.println("-------------------");
		
		char ch1 = 'A';//십진수로 따지면 65에 해당
		char ch2 = 'a';//십진수로 따지면 97에 해당
		boolean result5 = ch1 < ch2;
		System.out.println("result5=" + result5);
		System.out.println('a' == 97);
		System.out.println(0.1d == (double)0.1f);
		
		System.out.println("3.5 === 3.5f : " + (3.5 == 3.5f));
		System.out.println("3.2 === 3.2f : " + (3.2 == 3.2f));
		System.out.println("(float)3.2 === 3.2f : " + ((float)3.2d == 3.2f));
		//double과 float은 비교 불가 p.89
		System.out.println(Double.compare(3.21, 3.21f));
		// < > >= <= == != 원시형 숫자타입 (include char)
		String str1 = "A";
		String str2 = "A";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		//string만 값 비교할 때 == 절대 쓰지 않는다!!! '=='비교는 주소가 같은지 물어보는 것
		System.out.println("str1.equals(str2) : " + str1.equals(str2));//굉장히 중요!!!
		System.out.println("str1.equals(str2) : " + str2.equals(str1));//순서는 상관없음
	}
}
