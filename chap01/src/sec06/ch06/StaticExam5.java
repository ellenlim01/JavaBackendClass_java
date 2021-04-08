package sec06.ch06;

public class StaticExam5 {

	public static void main(String[] args) {
		StaticExam5 num = new StaticExam5();
		num.n1 = 10;
		num.n2 = 10;
		int result = num.sum();
		System.out.println(result);

	}

	int n1;
	int n2;

	public int sum() {
		return n1 + n2;
	}
}   
     