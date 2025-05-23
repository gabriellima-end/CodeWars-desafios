package testesCodeWarsYourOrder;

import java.util.Arrays;
import java.util.Comparator;

public class StringInOrder {
	
	
	
	public static void main(String[] args) {
		
		
		String words = "is2 Thi1s T4est 3a";
		
		//splitting the sentence into an array
		String[] wordsSplited = words.split(" ");
		
		//System.out.println("debug um: " + Arrays.toString(wordsSplited));
		
		//sorting the array      	
		Arrays.sort(wordsSplited ,Comparator.comparingInt(p -> {
			
			//removing all the letters, everything that is not a number
			return Integer.parseInt(p.replaceAll("\\D", ""));
			
		}));
		
		
		System.out.println(Arrays.toString(wordsSplited).replace("[", "").replace("]", "").replace(",", "").trim());
		
		
	}
	
	
	
	public static String order(String words) {
		
		if(words == "") { return ""; }
	
		//splitting the sentence into an array
		String[] wordsSplited = words.split(" ");
		
		//sorting the array      	
		Arrays.sort(wordsSplited ,Comparator.comparingInt(p -> {
			
			//removing all the letters, everything that is not a number
			return Integer.parseInt(p.replaceAll("\\D", ""));
			
		}));
		
		return Arrays.toString(wordsSplited).replace("[", "").replace("]", "").replace(",", "").trim();
	}
}
