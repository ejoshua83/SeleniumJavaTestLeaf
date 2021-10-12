package week1.day2;

public class CharOccurence {
	
	public static void main(String[] args) {
		
		String myStr1 = "Welcome to Chennai";
		int count = 0;
		
		char[] myCharArray = myStr1.toCharArray();
		
		for (int i = 0; i < myCharArray.length; i++) {
			if(myCharArray[i] == 'e') {
				count++;
			}
		}
		
		System.out.println("Total Number of Occurence of letter 'e' is "+count);
	}

}
