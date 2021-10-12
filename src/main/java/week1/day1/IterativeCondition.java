package week1.day1;

public class IterativeCondition {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int j = 0;
		int k = j++;
		int l = ++j;
		System.out.println("j++: "+ k);
		System.out.println("++j: "+ l);
		
		int number = 5;
		
		while(number < 10) {
			System.out.println("Number is :" +number);
			number++;
		}
	}

}
