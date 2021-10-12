package week1.day1;

public class FactorialAssignment {
	
	public static void main (String [] args) {
		
		int ipValue = 5;
		int opValue = 1;
		
		while(ipValue != 0) {
			
			opValue = ipValue * opValue;
			ipValue--;
		}
		
		System.out.println("Factorial Value :" + opValue);
	}

}
