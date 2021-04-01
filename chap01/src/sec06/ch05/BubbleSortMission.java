package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 6 };
		// 중첩 for문 사용
		for (int i = 1; i < arr.length; i++) {
			for (int z = 0; z < arr.length-i; z++) {
				if (arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int z = i+1; z < arr.length-1; z++) {
//				if (arr[i] < arr[z]) {
//					int temp = arr[i];
//					arr[i] = arr[z];
//					arr[z] = temp;
//					System.out.println(Arrays.toString(arr));
//				}
//			}
//		}
	} 
}
