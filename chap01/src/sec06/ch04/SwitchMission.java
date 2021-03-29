package sec06.ch04;

public class SwitchMission {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8;//Math.random()은 메소드, double으로 나오고 1은 절대 안나옴, ~0.999
		//0~3, 결국 8~11 사이의 정수값이 time변수에 대입됩니다.
		
		//time이 8이면 "출근합니다"
		//time이 9이면 "회의를 합니다"
		//time이 10이면 "업무를 봅니다"
		//나머지 시간이면 "외근을 나갑니다"
		
		System.out.println("time : " + time);
		
		switch(time) {
		case 8: 
			System.out.println("출근합니다");
			break;
		case 9: 
			System.out.println("회의를 합니다");
			break;
		case 10: 
			System.out.println("업무를 봅니다");
			break;
		default:
			System.out.println("외근을 나갑니다");
		}
		
	}
}
