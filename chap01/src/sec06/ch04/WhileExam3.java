package sec06.ch04;

public class WhileExam3 {
	public static void main(String[] agrs) {
		int val = 0, sum = 0;
		do {
			val = (int) (Math.random() * 11);
			System.out.println("val : "+ val);
			sum += val;
		} while (val != 0);//val의 초기 값이 0이지만 최초 한번은 물어봐줌, 뒤에 0이 아니어야한다는 조건이 있기 때문
		System.out.println("dowhile-sum : " + sum);
	}
}
