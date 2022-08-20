package calculator;


public class SimpleCalculator {
	public int add(int numberA, int numberB) {
		return numberA + numberB;
	}
	
	public char determineLetterGrade(int numberGrade) {
		if(numberGrade < 0) {
			throw new IllegalArgumentException("Number grade cannot permited");
		}
		else if(numberGrade < 60) {
			return 'F';
		}
		else if(numberGrade < 70) {
			return 'D';
		}
		else if(numberGrade < 90) {
			return 'C';
		}else{
			return 'B';
		}
		
		
	}
	
}
