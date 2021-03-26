package sec06.ch03;

public class AssignmentOperatorExam {
	 public static void main(String[] args) {
		 int n1 = 0;//최초에 값이 없었다가 0으로 바뀐 것
		 n1 = n1 + 5;//뒤에 있는 n1은 읽기 '='이 있어야 쓰기
		 System.out.println("n1 : " + n1);
		 
		 int n2 = n1 + 10;//여기서의 n2는 15, n1의 값은 바뀐적이 없음
		 
		 System.out.println("n2 : " + n2);
		 System.out.println("n2 : " + n1);//읽고 쓰고를 구분 잘 할 것
		 
		 n1 = 2;// 찍히는 n1값은 5
		 
		 int n3 = 0;
		 n3 += 5;// n3 = n3 + 5
		 System.out.println("n3 : " + n3);
		 
		 int n4 = 10;
		 n4 -= 4;//마이너스 복합식을 사용하여 4를 뺌
		 System.out.println("n4 : " + n4);
	 }
}
