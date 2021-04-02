package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 6 };
		// 중첩 for문 사용
		for (int i = 1; i < arr.length; i++) {
			for (int z = 0; z < arr.length - i; z++) {
				if (arr[z] > arr[z + 1]) {
					int temp = arr[z];
					arr[z] = arr[z + 1];
					arr[z + 1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
		}

		for (int i = arr.length - 1; i > 0; i--) {
			for (int z = 0; z < i; z++) {
				if (arr[z] > arr[z + 1]) {
					int temp = arr[z];
					arr[z] = arr[z + 1];
					arr[z + 1] = temp;
				}
			}
		}
//SelectionSort(선택 정렬)
//		for (int i = 0; i < arr.length-1; i++) {
//			int minIdx = i;
//			for (int z = i+1; z < arr.length; z++) {
//				if (arr[minIdx] > arr[z]) {
//					minIdx = z;
//					System.out.println(Arrays.toString(arr));
//				}
//			}
//		int temp = arr[minIdx];
//		arr[minIdx]= arr[i];
//		arr[i] = temp;
//		}
	}
} 