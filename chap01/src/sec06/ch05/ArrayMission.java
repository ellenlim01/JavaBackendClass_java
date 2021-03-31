package sec06.ch05;

public class ArrayMission {
	public static void main(String[] agrs) {
		int[] intArray = new int[10];//각방의 type은 int형
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = 20;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
		}
	}
}
