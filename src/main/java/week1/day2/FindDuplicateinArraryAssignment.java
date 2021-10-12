package week1.day2;

public class FindDuplicateinArraryAssignment {
	
	public static void main(String[] args) {
		
		int[] myArrayVal = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		for(int i = 0; i < myArrayVal.length; i++) {
			for(int j = i+1; j < myArrayVal.length; j++) {
				if(myArrayVal[i] == myArrayVal[j]) {
					System.out.println(myArrayVal[i] + " is a duplicate value in the array");
				}
			}
		}
		
	}

}
