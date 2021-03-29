package sec06.ch04;

public class ForExam {
	public static void main(String[] args) {// 주황색 글자들은 모두 예약어
		for (int i = 0; i < 10; i++) { // 초기화, 몇번 반복할지,증감식(반복할 때마다 1씩 올라감, 10에서 멈춤)
			System.out.println("i : " + i);
		}
		//for(;;) { //(int i=0; i<10;)
			System.out.println("안녕");//무한루프
		//}
	}
}