package testesCodeWarsReverseWord;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

	
	public static void main(String[] args) {
		
		String phrase = "  double  spaced  words  ";
		
		
//		StringBuffer stringBufferOriginal = new StringBuffer(phrase);
//		
//		StringBuffer reverseOriginal = stringBufferOriginal.reverse();
//		
//		String stringReverseOriginal = reverseOriginal.toString();
//		
//		String[] reverseOrganize = stringReverseOriginal.split(" ", -1);
//		
//		List lista = Arrays.asList(reverseOrganize);
//		
//		Collections.reverse(lista);
//		
//		//System.out.println(lista);
//		
//		System.out.println(lista.toString().replace(",", "").replace("[", "").replace("]", ""));
		
		
		System.out.println(reverseWords(phrase));
		
		
	    
	}
	
	
	
	public static String reverseWords(final String original) {
	    
		
		StringBuffer stringBufferOriginal = new StringBuffer(original);
		
		StringBuffer reverseOriginal = stringBufferOriginal.reverse();
		
		String stringReverseOriginal = reverseOriginal.toString();
		
		String[] reverseOrganize = stringReverseOriginal.split(" ", -1);
		
		List lista = Arrays.asList(reverseOrganize);
		
		Collections.reverse(lista);
		
	    return lista.toString().replace(",", "").replace("[", "").replace("]", "");
	    
	  }
}
//COMPLETO