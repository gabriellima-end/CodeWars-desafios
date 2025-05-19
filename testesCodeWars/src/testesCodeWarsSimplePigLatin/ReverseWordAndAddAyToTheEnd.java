package testesCodeWarsSimplePigLatin;

import java.util.Arrays;

public class ReverseWordAndAddAyToTheEnd {

	public static void main(String[] args) {
		
		String word = "Hello world!";
		
		System.out.println(pigIt(word));
		
	}
	
	public static String pigIt(String str) {
        
		String[] splitSentence = str.split(" ");
		
		StringBuilder result = new StringBuilder(); 

		for(String word : splitSentence) {
			
			if(word.matches("[a-zA-Z]+")) {
				
				result.append(word.substring(1));
				result.append(word.charAt(0));
				result.append("ay");
				
			}else {		
				result.append(word);			
			}		
			result.append(" ");			
		}
		
		return result.toString().trim();
    }
	
	
}
//COMPLETO