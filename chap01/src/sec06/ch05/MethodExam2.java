package sec06.ch05;

public class MethodExam2 {
	public static void main(String[] args) {
		int n1=10, n2=30;
		
		voidSum(n1, n2);
		voidSum(n1, n2); //void형은 return하지 않기 때문에 type을 주지 않고 등호를 사용하지 않아야 함
		System.out.println("----------------------------");
		int result = intSum(n1, n2);
		System.out.printf("%d 더하기 %d는 %d입니다.\n", n1, n2, intSum(n1, n2));
		result = intSum(1, 2);
		System.out.println("result-2 : " + result);
		
		for(int i=0; i<100; i++) {
			hello();
		}
	}
	public static void hello() {
		System.out.println("안녕하세요!!!");
	}

	public static void voidSum(int n1, int n2) {// void는 return하지 않는 것
		System.out.printf("%d +%d = %d\n", n1, n2, (n1 + n2));
		
	}

	public static int intSum(int n1, int n2) { // int n1, n2 는 불가능, 따로 정의해줘야함
		return n1 + n2;//비보이드형 메소드는 return을 꼭 시켜줘야함 
	}
}
