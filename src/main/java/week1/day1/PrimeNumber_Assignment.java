package week1.day1;

public class PrimeNumber_Assignment {
	
	public static void main (String [] args) {
		
		int inputValue = 59;
		
		boolean isPrime = true;
		
		for(int i = 2; i < inputValue/2; i++) {
			if(inputValue % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(inputValue + " is a Prime Number");
		} else {
			System.out.println(inputValue + " is not a Prime Number");
		}
	}

}
