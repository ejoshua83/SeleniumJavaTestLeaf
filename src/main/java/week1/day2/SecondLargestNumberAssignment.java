package week1.day2;

import java.util.Arrays;

public class SecondLargestNumberAssignment {
	
	public static void main (String [] args) {
		
		int[] myArrayVal = {3,2,11,4,6,7};
		
		Arrays.sort(myArrayVal);
		
		System.out.println("Second Largest Number in the Array is " +myArrayVal[myArrayVal.length - 2]);
	}

}
