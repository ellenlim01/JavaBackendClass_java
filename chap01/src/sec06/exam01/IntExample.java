package sec06.exam01;
//정수 모두 정리(4가지)

public class IntExample {
	public static void main(String[] args) {
		byte b = 10;
		short s =20;
		int i =30; //주로 사용
		long l = 40;//슷자를 저장할 수 있는 크기가 다름
		
		//자동형변환; 비교할 때는 무조건 형이 같아야 함
		s = (short)b;//수문제가 될 경우 안쓰거나 강제현변환
		s = (short)i;
		
		char c ='a';// 문자, 거의 쓰지 않
	}
}
