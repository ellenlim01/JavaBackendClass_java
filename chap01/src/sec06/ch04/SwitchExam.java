package sec06.ch04;

public class SwitchExam {
	public static void main(String[] args) {
		int val = 4;
		switch(val) {//()안에는 값이 들어가야함, 범위 지정, :와 break사이 모든 소스 값 실행
		case 1://1이 아니기 떄문에 무시하고 지나감
			System.out.println("값은 1이다.");
			break;//switch문이 종료됨
		case 2:
			System.out.println("값은 2이다.ㅋㅋ");
			System.out.println("값은 2이다.ㅎㅎ");
		case 3: case 4:
			System.out.println("값은 3이다.");
			break;
		default:
			System.out.println("값은 1~3이 아니다.");//전부 break가 있으면 위치가 상관없지만 있으면 위치를 고려해야함
		}
		System.out.println("끝");
	}
}
