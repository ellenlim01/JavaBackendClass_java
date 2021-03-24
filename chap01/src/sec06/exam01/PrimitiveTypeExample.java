package sec06.exam01;

public class PrimitiveTypeExample {
	public static void main(String [] args) {
		//원시타입(Primitive Type)과 참조타입(Reference Type)
		//8개 빼고는 다 참조타입
		//byte, short, int, long
		//float, double
		//byte < short < int < long < float < double
		
		short sss1 = 10;
		long lll2 = 10;
		//short result = lll2 + sss1;
		long result = lll2 + (long)sss1;
		
		byte var1 = 0; // MAX:127
		short var2 = 128; //129 -> -127 / -129 -> 127
		var1 = (byte)var2;
		System.out.println("var1 : " + var1);//overflow 발생 underflow 발생시 값이 돌게 됨.
		//"string" + 뭐든 string타입으로 변함
		
		float var3 = 10.123f;
		int var4 = (int)var3;//실수를 일부러 날릴 때 사용
		System.out.println("var4 : " + var4); //중요
		
		//char (문자형)
		//boolean
		//원시타입은 리터럴값을 저장한다.
	}
	
}
