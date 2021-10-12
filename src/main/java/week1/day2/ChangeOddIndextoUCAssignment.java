package week1.day2;

public class ChangeOddIndextoUCAssignment {
	
	public static void main(String[] args) {
		
		String myStrVal = "changeme";
		
		char[] myCharVal = myStrVal.toCharArray();
		
		for(int i = 0; i < myCharVal.length; i++) {
			
			if(i % 2 == 0) {
				
				myCharVal[i] = Character.toUpperCase(myCharVal[i]);
			}
			System.out.print(myCharVal[i]);
		}
	}

}
