package sec06.ch07;

public class InterfaceExam {

	public static void main(String[] args) {
		RemoteControl rc1 = new LGTv();
		RemoteControl rc2 = new SamsungTv();
		
		rc1.volumeUp();
		rc2.volumeUp();
		
		rc1.chkVolume();
		rc2.chkVolume();
		
//		LGTv tv1 = new LGTv();
//		RemoteControl rc = tv1;;
//		//rc.Welcome(); 호출 할 수 없음
//		rc.volumeUp();
//		rc.volumeDown();
//		tv1.chkVolume();
	}

}
