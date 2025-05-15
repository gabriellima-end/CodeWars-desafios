package testesCodeWarsSimplePigLatin;

import java.util.Arrays;

public class ReverseWordAndAddAyToTheEnd {

	public static void main(String[] args) {
		
		String word = "This is my string!";
		
		System.out.println(pigIt(word));
		
	}
	
	
	
	public static String pigIt(String str) {
        
		String[] splitSentence = str.split(" ");
		
		StringBuilder result = new StringBuilder(); 
		
		
		for(String word : splitSentence) {
			
//			char special = '!';
//			int lenght = word.length();
//			char lastCaracter = word.charAt(lenght - 1);
			
			if(word.matches("[a-zA-Z]+")) {
			result.append(word.substring(1));
			result.append(word.charAt(0));
			result.append("ay");
			}else {
				word = word.replace("!", "");
				result.append(word.substring(1));
				result.append(word.charAt(0));
				result.append("ay");
				result.append("!");
			}
			
			
			result.append(" ");
			
				
			
		}
		
		return result.toString().trim();
    }
	
	
}
//INCOMPLETO