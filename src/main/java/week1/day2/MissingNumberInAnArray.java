package week1.day2;

public class MissingNumberInAnArray {
	
	public static void main (String [] args) {
		
		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 10};
		int checkNum = 1;
		
		for(int i = 0; i < myArray.length; i++) {
			
			if(myArray[i] != checkNum) {
				break;
			}
			checkNum++;
		}
		System.out.println("Missing Number in the Array is: "+checkNum);
	}

}
