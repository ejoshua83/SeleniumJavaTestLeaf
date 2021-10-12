package week1.day1;

public class BreakContinueReturn {
	
	public static void main(String[] args) {
		
		// Break
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("i: " +i);
			if(i == 5) {
				break;
			}
		}
		
		System.out.println("Break out of FOR loop");
		
		// Continue
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.println("i: " +i);
		}
		
		System.out.println("Skip 5 and continued");
		
		// Return
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("i: "+ i);
			if(i == 5) {
				// return; // Will go out of the main method
			}		
		}
		
		System.out.println("It never got printed");
		
		// Print even numbers from 0 to 50
		
		for (int j = 0; j < 50; j++) {
			
//			if(j % 2 == 0) {
//				System.out.println(j + " is an even number");
//			}			
			// OR
			if(j % 2 != 0) {
				continue;
			}
			System.out.println(j + " is an even number");
		}
	}

}
