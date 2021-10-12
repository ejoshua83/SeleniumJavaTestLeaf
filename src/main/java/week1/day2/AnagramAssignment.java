package week1.day2;

public class AnagramAssignment {
	
	public static void main(String[] args) {
		
		String myStrVal1 = "stops";
		String myStrVal2 = "potss";
		
		char[] myCharVal1 = myStrVal1.toCharArray();
		char[] myCharVal2 = myStrVal2.toCharArray();
		
		int count = 0;
		
		if(myStrVal1.length() == myStrVal2.length()) {
			for(int i = 0; i < myStrVal1.length(); i++) {
				for(int j = 0; j < myStrVal2.length(); j++) {
					if(myCharVal1[i] == (myCharVal2[j])) {
						System.out.println(myCharVal1[i] + " in the index " + i + " matched with " +myCharVal2[j]+ " in the index " +j);
						count++;
						break;
					}
				}
			}
			if(count == myStrVal1.length()) {
				System.out.println(myStrVal1 + " & " + myStrVal2 + " are Anagrams");
			}
			
		} else {
			System.out.println(myStrVal1 +" & "+myStrVal2 + " are not having same length");
		}
	}

}
