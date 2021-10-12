package week1.day2;

public class ReverseEvenWordsAssignment {

	public static void main(String[] args) {

		String myStrVal = "I am a Software Tester";

		String[] myStr = myStrVal.split(" ");

		int strLen = myStr.length;

		String revVal = "";

		for (int i = 0; i < strLen; i++) {

			if (i % 2 != 0) {

				char[] myCharVal = myStr[i].toCharArray();
				for (int j = myCharVal.length - 1; j >= 0; j--) {
					revVal = revVal + myCharVal[j];
				}
			}
			else {
				revVal = revVal + myStr[i];
			}
		}
		System.out.println("Changed String Value is " + revVal);
	}

}
