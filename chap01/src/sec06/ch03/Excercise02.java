package sec06.ch03;

public class Excercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);//11+20
		System.out.println("z : " + z);//31
		System.out.println("x : " + x);//11
		System.out.println("y : " + y);//19
		
		int pencils =534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println("pencilsPerStudent : " + pencilsPerStudent);
		
		int pencilsLeft =pencils % students;
		System.out.println("pencilsLeft : " + pencilsLeft);
		
		int value = 356;
		System.out.println(value / 100*100);
		
		int result1 = value / 100;
		int result2 = result1 * 100;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		System.out.println(value - value % 100);
		
		int top = 5;
		int bottom = 10;
		int height = 7;
		double area = (top + bottom) *height /2.0;
		System.out.println("area : " + area);
		
	}
}
