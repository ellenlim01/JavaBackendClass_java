package sec06.ch04;

public class ForMission2 {
	public static void main(String[] args) {
		int sum = 0;
		/*sum = sum + 1;
		System.out.println("sum : " + sum);
		
		sum = sum + 2;
		System.out.println("sum : " + sum);
		
		sum = sum + 3;
		System.out.println("sum : " + sum);
		
		//1~20더하기*/
		for (int i=0; i<21; i++) {
			sum += i;
		}
		System.out.println("sum :" + sum);
	}
}
