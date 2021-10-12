package week1.day1;

public class FibonacciSeries_Assignment {

	public static void main(String[] args) {

		int length = 6;
		int currValue = 1;
		int prevValue = 0;
		int sumValue = 0;
		System.out.println("Value = " + prevValue);
		System.out.println("Value = " + currValue);

		for (int i = 1; i <= length; i++) {

			sumValue = prevValue + currValue;
			System.out.println("Value = " + sumValue);
			prevValue = currValue;
			currValue = sumValue;
		}
	}

}
