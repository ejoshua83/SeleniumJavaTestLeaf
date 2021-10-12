package week1.day2;

public class TwoSumArrayProbelm {
	
	public static void main(String [] args) {
		
		int[] myArrayVal = {2, 11, 15, 7, 3, 5, 1, 8, 4};
		
		// Find the 2 numbers which sum to 9
		
		for (int i = 0; i < myArrayVal.length; i++) {
			for (int j = i+1; j < myArrayVal.length; j++) {
				if(myArrayVal[i] + myArrayVal[j] == 9) {
					System.out.println("2 values when sum of both 9 is: " + myArrayVal[i] +"," + myArrayVal[j] 
							+ " in the index " + i + "," +j);
				}
			}
		}
		
	}

}
