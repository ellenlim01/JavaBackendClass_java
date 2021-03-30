package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] agrs) {

		int sum = 0;

		int val = (int) (Math.random() * 11);
		System.out.println("val: " + val);
		
		while (val != 0) {//0이 니올 때까지 반복문 돌린 것
			sum += val;
			val = (int) (Math.random() * 11);
			System.out.println("val: " + val);
		}
		System.out.println("sum : " + sum);//지금까지 더한 값 출력
	}
}
