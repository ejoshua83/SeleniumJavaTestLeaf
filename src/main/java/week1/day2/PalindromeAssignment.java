package week1.day2;

public class PalindromeAssignment {
	
	public static void main (String[] args) {
		
		String strVal = "malayalam";
		
		int strLen = strVal.length();
		
//		Method #1
		
//		for(int i = 0; i < strLen; i ++) {
//			for(int j = (strLen-1) - i; j >= 0;) {
//				char charVal1 = strVal.charAt(i);
//				char charVal2 = strVal.charAt(j);
//				if(charVal1 == charVal2) {
//					break;
//				} else {
//					System.out.println(strVal + " is not a Palindrome");
//					return;
//				}
//			}
//		}
//		System.out.println(strVal + " is a Palindrome");		
		
//		Method #2
		
		String revStr = "";
		
		for(int i = strLen-1; i >= 0; i--) {
		
			revStr = revStr + strVal.charAt(i);
		}
		System.out.println("Reversed String is " + revStr);
		
		if(strVal.equals(revStr)) {
			System.out.println(strVal + " is a Palindrome");
		} else {
			System.out.println(strVal + " is NOT a Palindrome");
		}
	}

}
