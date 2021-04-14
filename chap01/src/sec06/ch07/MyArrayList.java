package sec06.ch07;

public class MyArrayList implements MyList {
	private int[] arr;//전역변수에는 기본적으로 null이 들어감 즉 아무 주소 값도 가리키지 않고 있다
	
	public MyArrayList() {
		arr = new int[0];//방이 없는 것
	}
	@Override
	public void add(int value) {
		int[] temp = new int[arr.length +1];
	
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = value;
		arr = temp;
	}
	
	public void add(int room, int value) {
		int[] temp = new int[arr.length+1];
		
		for(int i=0; i<room; i++) {
			temp[i] = arr[i];
		}
		temp[room] = value;
		for(int j=room+1; j<arr.length+1;j++) {
			temp[j] = arr[j-1];	
		}
		arr = temp;
		
//		int[] temp = new int[arr.length+1];
//		for(int i=0; i<arr.length; i++) {
//			int tIdx = i < room ? i : i+1;
//			temp[tIdx] = arr[i];
//		}
//		temp[room] = value;
//		arr = temp;
	}
	
	
	@Override
	public int remove() {
		int[] temp = new int[arr.length-1];
		
		for(int i=0; i<arr.length-1; i++) {
			temp[i] = arr[i];
		}
		int a = arr[arr.length-1];
		arr = temp;
		return a;
	}

	@Override
	public int remove(int num) {
		int[] temp = new int[arr.length-1];
		
		for(int i=0; i<num; i++) {
			temp[i] = arr[i];
		}
		for(int j=num; j<arr.length-1;j++) {
			temp[j] = arr[j+1];	
		}
		int a = arr[num];
		arr = temp;
		return a;
		
//		int delVal = arr[num];
//		int[] temp = new int[arr.length - 1];
//		for(int i=0; i<temp.length; i++) {
//			int tIdx = i< num ? i : i+1;
//			temp[i] = arr[tIdx];
//		}
//		arr = temp;
//		return delVal;
	}
	
	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int b) {//잠깐 살았다가 메소드가 끝나면 죽는 지역변수
		return arr[b];
	}

}
