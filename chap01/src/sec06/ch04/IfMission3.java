package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random()*20) + 81;
		System.out.println("SCORE :" + SCORE);
		//score의 값은 81~100점 사이의 값이 된다(실행할 때마다 달라짐)
		//90~100 A (97점 이상은 "A+", 96~94 "A", 93~91 "A-"
		//81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-"
		
		String displayResult1 = "A";
		String displayResult2 = "+";
		
		if(SCORE<91) {
			displayResult1 = "B";
		} 
		
		if((SCORE%10)<7) {
			displayResult2 ="";
			if((SCORE%10)<4) {
				displayResult2 ="-";
			}
		}
		
		System.out.printf("%s %s", displayResult1, displayResult2);
	
		
		/*
		//71~80 C (77점 이상은 "C+", 76~74 "C", 73~71 "C-"
		//나머지는 D
		final int SCORE = (int)(Math.random() * 41) +60;
		system.out.println("SCORE :" + SCORE);
		
	
		String dGrade = "D";
		char dGradeChar =' ';jk 
		
		int restVal = SCORE % 10;
		if(restVal >= 7 || restVal == 0) {
		dGradeChar = '+';
		} else if(restVal <= 3) {
		dGradeChar = '-';
		}
		
		if(SCORE > 90) {
		dGrade = 'A';
		} else if(SCORE > 80) {
		dGrade = 'B';
		} else if(SCORE > 70) {
		dGrade = 'C';
		} else {
		dGradeChar = ' ';
		}
		
		System.out.printf("%s%c", dGrade, dGradeChar);
		*/
	}
}