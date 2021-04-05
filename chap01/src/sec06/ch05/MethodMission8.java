package sec06.ch05;

public class MethodMission8 {
	public static void main(String [] args) {
		gugudan(8);
		
		gugudan(4, 8);
	}
	
	public static void gugudan(int a) {
		for (int i=1; i<10; i++) {
			int result = a * i;
			System.out.printf("%d * %d = %d\n", a, i, result);
		}
		System.out.println();
	}
	//변수명은 절대 대문자로 시작하지 않음
	public static void gugudan(int n1, int n2) {
		for(int i=n1; i<=n2; i++) {
			gugudan(i); 
		}
	}

}
