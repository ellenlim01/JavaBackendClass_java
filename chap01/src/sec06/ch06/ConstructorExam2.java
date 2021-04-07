package sec06.ch06;

public class ConstructorExam2 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
	}
}
class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv2(){
		this("일렉트로", 50, 100, 50);
	}
	
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n", brand, inch, maxChannel, maxVolume);
	}
}