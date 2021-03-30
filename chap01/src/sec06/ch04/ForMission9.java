package sec06.ch04;

public class ForMission9 {
	public static void main(String[] args) {
		int star = 5;
		//5일경우
		//____*
		//___**
		//__***
		//_****
		//*****
		
		for(int i=1; i<=star; i++) {
			for(int j=i; j<star; j++) {
				System.out.print("_");
			}
			for(int z=0; z<i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*for(int i=star; i>0; i--) {
			for(int k=1; k<=star; k++) {
				if(k<i) {
					System.out.print("_");
				} else {
				System.out.print("*");
				}
				System.out.println();
			}
		}
		

		*/
		
	}
}
