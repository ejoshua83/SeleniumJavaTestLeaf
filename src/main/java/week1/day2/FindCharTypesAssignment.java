package week1.day2;

public class FindCharTypesAssignment {
	
	public static void main(String[] args) {
		
		String myStrVal = "$$ Welcome to 2nd Class of Automation $$ ";
		
		char[] myCharVal = myStrVal.toCharArray();
		
		int charVal = 0;
		int charSpc = 0;
		int charNum = 0;
		int charSpl = 0;
				
		for(int i = 0; i < myCharVal.length; i++) {
			if(Character.isLetter(myCharVal[i])) {
				charVal++;
			} else if(Character.isSpaceChar(myCharVal[i])){
				charSpc++;
			} else if(Character.isDigit(myCharVal[i])) {
				charNum++;
			} else {
				charSpl++;
			}
		}
		System.out.println("Total Number of Letters: " +charVal);
		System.out.println("Total Number of Space: " +charSpc);
		System.out.println("Total Number of Numbers: " +charNum);
		System.out.println("Total Number of Special Characters: " +charSpl);
	}

}
