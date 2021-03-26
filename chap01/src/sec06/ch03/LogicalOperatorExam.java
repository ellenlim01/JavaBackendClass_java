package sec06.ch03;

public class LogicalOperatorExam {
	
	public static void main(String[] args) {
		//&&(and), ||(or), !(not)
		boolean res1 = (1<7) && true && false;//단 하나라도 false가 있으면 false
		System.out.println("res1 : " + res1);
		
		boolean res2 = true || !true || false;//단 하나라도 true가 있으면 true
		System.out.println("res2 : " + res2);
		
		//꿀팁
		//&&를 쓸 때 false가 날 가능성이 높은 아이를 가장 앞에 두는게 좋은 퍼포먼스를 낼 수 있음
		//||를 쓸 때 true가 날 가능성이 높은 아이를 가장 앞에 두는게 좋은 퍼포먼스를 낼 수 있음
		int n = 2;
		boolean res = false && (1<n++);//(1<n++)가 앞에 있다면 먼저 연산하고 판단
		System.out.println("n : " + n);
		
		
	}
}
