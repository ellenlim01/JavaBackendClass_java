package sec06.ch05;

public class ArrayExam {
	public static void main(String[] args) {
		// 배열(같은 타입의 변수를 여러개 사용하기 편하기 위해 사용하는 것)

		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;// 단독주택

		int[] intArr = new int[500];// 1층에 값1개 들어가는 10층짜리 아파트
		intArr[0] = 11;
		intArr[1] = 12;
		intArr[9] = 13;
		intArr[3] = intArr[9] + 4;// 값을 주지 않으면 그 안에는 0이 들어있음(숫자형들은 무조건,double 등등)
		// boolean의 기본 값은 false가 들어있음
		// String배열 변수 2가지(원시형Primitive type, 참조형Reference type)
		// 원시형:byte short int long boolean char float double
		// 참조형은 무조건 대분자로 시작, 각방에 null 들어감
		String[] strArr = new String[10];
		System.out.println(strArr[1]);

		int len = 100;
		int[] Arr = new int[len];//int는 원시형이지만 [] 붙으면 참조형임
		System.out.println(Arr[1]);

		int[] intArr2 = {10, 20, 30};
		
		for(int i=0; i<3; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr2[i]);
		}
	}
}
