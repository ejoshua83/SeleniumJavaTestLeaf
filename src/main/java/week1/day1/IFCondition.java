package week1.day1;

public class IFCondition {
	
	public static void main(String[] args) {
		
		// Classroom 1
		
		int number1 = 15;
		
		if(number1 % 3 == 0 && number1 % 5 != 0) {
			System.out.println("TRIZZ");
		} else if (number1 % 3 != 0 && number1 % 5 == 0) {
			System.out.println("FIZZ");
		} else if(number1 % 3 == 0 && number1 % 5 == 0) {
			System.out.println("TRIZZ-FIZZ");
		} else {
			System.out.println("Not divisible by both 3 & 5");
		}
		
		// Classroom 2
		
		int number2 = -5;
		
		if(number2 > 0) {
			System.out.println("Number is Positive");			
		} else {
			System.out.println("Number is Negative");
		}
		
		// Classroom 3
		
		int number3 = 7;
		
		if(number3 % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

}
