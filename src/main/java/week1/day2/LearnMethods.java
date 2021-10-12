package week1.day2;

public class LearnMethods {
	
	public static void main(String [] args) {
		
		LearnClass obj = new LearnClass();
		System.out.println("Mobile Brand Name is:" + obj.brandName);
		System.out.println("Mobile Cost is: "+ obj.mobileCost);
		
		obj.makeCalls();
		obj.sendMsg();
		//obj.payBills();
	}

}
