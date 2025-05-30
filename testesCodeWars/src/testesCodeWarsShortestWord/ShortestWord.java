package testesCodeWarsShortestWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShortestWord {
	
	public static void main(String[] args) {
		
		String sentence = "";
		
		System.out.println(findShort(sentence));
		
//		String[] sentenceSplitted = sentence.split(" ");
//		
//		int lengWord = 0;
//		
//		
//		
//		List<Integer> shortestWordInt = new ArrayList<Integer>();
//		
//		
//		for(String word : sentenceSplitted) {
//			
//			lengWord = word.length();
//			
//			shortestWordInt.add(lengWord);
//			
//		}
//		
//		int shortestWordresult = Collections.min(shortestWordInt);
//		
//		System.out.println(shortestWordresult);
		
	}
	
	
	public static int findShort(String s) {
		
		String[] sentenceSplitted = s.split(" ");
		
		int lengWord = 0;
		
		List<Integer> shortestWordInt = new ArrayList<Integer>();
		
		for(String word : sentenceSplitted) {
			
			lengWord = word.length();
			
			shortestWordInt.add(lengWord);
			
		}
		
		int shortestWordresult = Collections.min(shortestWordInt);
		
		return shortestWordresult;
    }
}
