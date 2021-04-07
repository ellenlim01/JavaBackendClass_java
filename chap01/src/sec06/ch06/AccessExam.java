package sec06.ch06;

public class AccessExam {//한 파일 안에서 같은 파일명인 class에게만 줄 수 있다
	public static void main(String[] args) {
		Access acc = new Access();
		acc.printNum();
	}
}

class Access {
	private int num;
	
	void printNum() {
		System.out.println("num : "+ num);
	}
}