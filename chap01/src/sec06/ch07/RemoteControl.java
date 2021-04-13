package sec06.ch07;

public interface RemoteControl {//구현체를 가질 수 없고 선언구만 가짐 즉 어떤 것을 만들라고 명령만 하는 것
	int AGE = 10; //자동으로 public static final 다 붙음
	
	public abstract void volumeUp();
	void volumeDown();//public abstract이 자동으로 생략 됨
	void chkVolume();
}
