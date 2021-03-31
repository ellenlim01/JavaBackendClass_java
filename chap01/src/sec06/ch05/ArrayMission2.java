package sec06.ch05;

public class ArrayMission2 {
	public static void main(String[] args) {
		//업무분리가 굉장히 중요, 출력과 입력은 무조건 분리시킬 것!!!
		int[] intArr = new int[10];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
	}
}
