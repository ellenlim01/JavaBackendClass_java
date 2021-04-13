package sec06.ch07;

import java.util.List;

import sec06.ch06.blackjack.Card;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExam {
	public static void main(String[] args) {
		List list = new ArrayList();//저장공간(배열과는 조금 다름)
//		List list2 = new LinkedList();
		//add로 값을 넣는데 순서가 있음, 값을 가져올 때 순서로 값을 가져올 수 있음
		list.add(10);
		list.add(10.1);
		list.add("ddd");
		list.add(new Card("",""));
		
		int val2 = (int)list.get(0);
		System.out.println("val2 : " + val2);
		
		Object obj = list.get(1);
		double val = (double)obj;
		System.out.println("val : " + val);
		//메소드를 사용하기 위해서는 type에 맞게 형변환해서 사용해야 함
		
//		Box box1 = new Box();
//		box1.val = 10;
		
	}
}
class Box{
	int val;
	Box nextBox;
}