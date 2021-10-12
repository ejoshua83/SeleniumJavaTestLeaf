package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArrays {

	public static void main(String []args) {

		int[] myArray = {100, 49, 398, 34, 1, 267};
		
		// Get the Array length
		int length = Array.getLength(myArray);
		System.out.println("Length of Array "+ length);
		
		// Display the Array Values
		System.out.println("Displaying the Array Values");
		for (int i = 0; i < length; i++) {
			System.out.println(i + " position Array Value is :" +myArray[i]);
		}
		
		// Sorting the Array Value
		Arrays.sort(myArray);
		System.out.println("Sorted Array Values");		
		for (int i = 0; i < length; i++) {
			System.out.println(i + " Sorted Array Value is :" +myArray[i]);
		}
		
		// Second Largest Array Value
		System.out.println("Second Largest Array Value :" + myArray[length-2]);
		
		// Second Smallest Array Value
		System.out.println("Second Largest Array Value :" + myArray[1]);
		

	}
}
