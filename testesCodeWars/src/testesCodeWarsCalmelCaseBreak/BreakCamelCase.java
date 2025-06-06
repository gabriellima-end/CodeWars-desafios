package testesCodeWarsCalmelCaseBreak;

import java.util.Arrays;

public class BreakCamelCase {
	
	public static void main(String[] args) {
		
		String originalSentence = "camelCaseOriginal";
		
		char[] charSentenceArray = originalSentence.toCharArray();
		
		System.out.println(charSentenceArray);
		
		char spaceLetter = ' ';
		
		StringBuffer buffer = new StringBuffer(new String(charSentenceArray));
		
		
		
		for(int i = 0; i<charSentenceArray.length; i++) {
			
			if(Character.isUpperCase(charSentenceArray[i])) {
				
				int countPosition = 0;
				
				countPosition = i;
				
				buffer.insert(countPosition, " ");
				System.out.println(countPosition);
			}
			
			
			
		}
		
		System.out.println(buffer);
		
		
	}
	
	public static String camelCase(String input) {
		
		
		
	    return null;
	  }
	
}
