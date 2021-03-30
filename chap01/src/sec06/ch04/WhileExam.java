package sec06.ch04;

public class WhileExam {
	public static void main(String[] agrs) {
		//while문은 조건식이 true인 동안 반복
		//while(true){} :무한 루프
		
		for(int i=0; i<5; i++) {
			System.out.println("i : " + i);
		}//몇번 돌지 알때 사용
		
		System.out.println();
		
		int i=0;
		while(i<5) {//언제 멈춰야하는지만 알 때 사용
			System.out.println("i : " + i);
			i++;
		}
	}
}
