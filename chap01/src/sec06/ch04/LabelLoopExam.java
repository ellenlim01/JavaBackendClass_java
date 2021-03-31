package sec06.ch04;

public class LabelLoopExam {
	public static void main(String[] args) {
		//OUTER:
		Possible://label 반복문인 while문이나 for문에서 사용가능
		for (int i =0; i<3; i++) {
			
			for(int z=100; z<105; z++) {
				System.out.printf("%d - %d \n", i, z);
				//INNER:
				if(z==102) {
					//break OUTER;
					//break INNER;
					//break;=
					continue Possible;
				}
			}
		}
		System.out.println("끝!");
	}
}
