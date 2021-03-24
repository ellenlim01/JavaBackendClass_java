package sec06.exam01;
//실수 2개, 정적 언어에서는 type이 굉장히 중요,형이 다르게 되면 문제될 가능성이 있다

public class FloatDoubleExample {
	public static void main(String[] args) {
		//float f = (float)10.1;
		//float f = 10.1f;
		float f = 10.1F;//컴파일 에러 발생
		double d = 10.2;//.이 들어가면 double 타입, float보다 더 큼, 둘 다 정확하지 않고 근사치인데 double이 더 가까움
		
	}
}
