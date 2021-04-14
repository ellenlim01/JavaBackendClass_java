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
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int b) {//잠깐 살았다가 메소드가 끝나면 죽는 지역변수
		return arr[b];
	}

}
