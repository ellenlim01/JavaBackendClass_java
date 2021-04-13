package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam3 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList();
		
		//Wrapper Class
//		Integer num1 = 10;
//		int num2 = 10;
		
		list.add(10);
		list.add(20);
		list.add(30);

		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d : %d\n", i, list.get(i));
		}
		System.out.println("----------------");
		
		for(int num : list) {
			System.out.println(num);
		}
	}
}
