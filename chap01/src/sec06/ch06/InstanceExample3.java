package sec06.ch06;

public class InstanceExample3 {
	public static void main(String[] args) {
		int mainNum = 10;
		
		Box box1 = new Box();//밑의 Box box와 다름, 다만 같은 값을 가지고 있을 뿐, box객체의 주소값을 가짐, 언제든지 접근가능
		box1.num = 10;
		
		changeNum(mainNum);
		System.out.println("mainNum :" + mainNum);
		
		changeBoxNum(box1);
		System.out.println("box1.num :" + box1.num);
	}

	public static void changeNum(int num) {//num과 mainNum은 다른 변수임
		num = 20;
	}
//Reference 변수는 굳이 return해줄 필요가 없음, void임에도 값을 바꿀 수 있음
	public static void changeBoxNum(Box box2) {
		box2 = new Box();//주소값이 바뀜
		box2.num = 20;//주소값을 바꾸진 않았음 
	   }
}

class Box {
	int num;
}