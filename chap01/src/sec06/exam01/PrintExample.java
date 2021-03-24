package sec06.exam01;

public class PrintExample {
	public static void main(String[] args) {
		//console에 찍을 수 있는 것
		System.out.println("하하");//자동 개행
		System.out.println("호호");
		//sysout+contol+spacebar
		System.out.println();//한칸 띄워주는 것
		System.out.print("하하");//개행이 안됨, 옆으로 찍힘
		System.out.print("호호");
		System.out.println();//한칸 띄워주는 것
		System.out.println();
		System.out.print("하하\n");//개행이 안됨, 옆으로 찍힘
		System.out.print("호호\n");
		
		//TODO System.out.printf 나중에 설명
		char bloodType = '0';
		int age = 10;
		float weight = 30.4f;
		String name = "홍길동";
		
		//제 이름은 홍길동며, 나이는 10살이고, 혈액형은 O형이고, 몸무게는 30.4kg입니다.
		System.out.println(" 제 이름은 " + name + "이며, 나이는 " + age + "살이고, 혈액형은 "
				+ bloodType + "형이고, 몸무게는 " + weight + "kg입니다.");
		//변수를 사용했기 때문에 값들을 바꾸면 자동으로 문장이 바뀜
		//string은 누굴 만나든 string으로 변환시킴
		System.out.printf("제 이름은 %s이며, 나이는 %05d살이고, 혈액형은 %c형이고, "
				+ "몸무게는 %3.2fkg입니다." , name, age, bloodType, weight);//%순서
		//5를 적은 것은 5칸을 사용하겠다는 이야기, 05는 앞 빈자리에 0을 채워줌(무조건 5자리 숫자를 만들 때 사용)
		//2021-01-10
		//%d, %f는 기능이 있음
		//3.2f는 전체 3칸을 쓰겠다(소수점도 포함), 소수점 2자리까지 표시하겠다는 의미
		//-붙이면 빈칸에서 왼쪽정렬(0을 안붙였을 때)
		
		char ch = 'c';
		System.out.printf("\n%d : %c", (int)ch, ch);//\n:개행시킴
	}
}
