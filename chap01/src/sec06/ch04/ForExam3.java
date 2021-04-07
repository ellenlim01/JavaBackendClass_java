package sec06.ch04;

public class ForExam3 {
	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 10, 56};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------");
		
		for(int val : arr) {
			//오른쪽에는 순서가 있는 여러개 값이 든 친구들, 돌릴 때마다 값을 val에 넣어줌
			System.out.println(val);
		}
	}
}
