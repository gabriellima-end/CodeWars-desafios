package testesCodeWarsMiddleChar;

import java.util.Arrays;

public class MiddleChar {

	public static void main(String[] args) {
		
		String sentence = "middle";
		
		System.out.println(getMiddle(sentence));
		
//		String[] splitSentence = sentence.split("");
//		
//		int numLen = splitSentence.length;
//		
//		int middleNum = numLen / 2;
//		
//		String middleLetter = "";
//		
//		if(numLen %2 == 0) {
//			
//			middleLetter = splitSentence[middleNum-1] + splitSentence[middleNum];
//			
//			System.out.println(middleLetter);
//			
//		}else {
//		
//			for(int i = 0; i<numLen; i++) {
//				
//				middleLetter = splitSentence[middleNum];
//				
//			}
//			
//			System.out.println(middleLetter);
//		}
//		
	}
	
	public static String getMiddle(String word) {
	    
		String[] splitSentence = word.split("");
		
		int numLen = splitSentence.length;
		
		int middleNum = numLen / 2;
		
		String middleLetter = "";
		
		if(numLen %2 == 0) {
			
			middleLetter = splitSentence[middleNum-1] + splitSentence[middleNum];
			
			return middleLetter;
			
		}else {
		
			for(int i = 0; i<numLen; i++) {
				
				middleLetter = splitSentence[middleNum];
				
			}
			
			return middleLetter;
		}
		
		
	  }
}
