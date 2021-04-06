package sec06.ch06;

public class InstanceExam5 {
	public static void main(String[] args) {
		Car[] carArr = new Car[5];//carArr = 5개 칸을 가지고 있는 서랍의 주소 값
		//reference type의 배열 생성시 각방은 무조건 null, 각방은 car type(car 객체만 저장 가능)
		Car car1 = new Car();
		//car[0].name = "그랜져";만 쓰면 불가능
	}
	//public static Car createCar() {
		//Car type의 주소 값을 return
	//}
}
