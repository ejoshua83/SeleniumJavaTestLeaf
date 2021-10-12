package week1.day2;

public class MyCalculatorAssignment {
	
	public static void main(String [] args) {
		
		CalculationAssignment calc = new CalculationAssignment();
		System.out.println("Performing the Calculation:");
		System.out.println("Addition Calculation " +calc.add(10, 10, 10));
		System.out.println("Subtration Calculation " +calc.sub(10, 10));
		System.out.println("Multiply Calculation " +calc.mul(10d, 10d));
		System.out.println("Division Calculation " +calc.div(100f, 10f));
		
	}

}
