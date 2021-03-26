package sec06.ch03;

public class OperatorExam2 {
	public static void main(String[] args) {
		int n1 = 10;
		System.out.println("n1 : " + n1);
		n1++;//n1의 값을 바꾸는 것. 단순히 +1은 값을 변화시키지는 않고 출력만
		n1++;
		System.out.println("n1 : " + n1);
		++n1;
		System.out.println("n1 : " + n1);
		--n1;
		System.out.println("n1 : " + n1);
		n1--;
		System.out.println("n1 : " + n1);
		
		System.out.println("-------------------------");
		
		int n2 = 10;
		int result = 10 + (++n2);//먼저 ++해주고 계산함
		System.out.println("n2 result : " + result);
		System.out.println("n2: " +n2);
		
		int n3 = 10;
		int result2 = 10 + (n3++);//10을 먼저 쓰고 나중에 더해줌
		System.out.println("n3 result : " + result2);
		System.out.println("n2: " +n3);//p.71
		
		//논리 부정 연산자(!) 단항 연산자(혼자서 쓰임)
		boolean result3 = !(10 > 2);
		System.out.println("result3 : " +!result3);//결과를 뒤집는다(not)
		
	}
}
