package week1.day2;

public class LearnClass {
	
	// Variables or State
	
	String brandName = "Samsung";
	int mobileCost = 1000;
	
	// Methods or Behavior
	// Syntax or Signature
	// Access Modifier/Specifier - returnType - methodName(<arguments>) {method body}
	
	public void makeCalls() {
		System.out.println("Calling from " +brandName);
	}
	
	public void sendMsg() {
		System.out.println("Sending Message from " + brandName);
	}
	
	private void payBills() {
		System.out.println("Paying Bills from Mobile");
	}
	
	public static void main(String [] args) {
		
		LearnClass obj = new LearnClass();
		obj.mobileCost = 1000;
		obj.brandName = "OnePlus";
		
		obj.sendMsg();
		obj.makeCalls();
		obj.payBills();
	}

}
