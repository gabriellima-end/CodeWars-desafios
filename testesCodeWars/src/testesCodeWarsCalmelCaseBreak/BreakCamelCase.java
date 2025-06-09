package testesCodeWarsCalmelCaseBreak;

import java.util.Arrays;

public class BreakCamelCase {
	
	public static void main(String[] args) {
		
		String originalSentence = "camelCasingTest";
		
		System.out.println(camelCase(originalSentence));
		
		//String[] resultSentence = originalSentence.split("(?=[A-Z])");

		//System.out.println(Arrays.toString(resultSentence).replace("[", "").replace(",", "").replace("]", ""));
		
		
	}
	
	public static String camelCase(String input) {
		
		String[] resultSentence = input.split("(?=[A-Z])");
		
		String result = Arrays.toString(resultSentence).replace("[", "").replace(",", "").replace("]", "");
		
	    return result;
	  }
	
}
