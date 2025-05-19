package testesCodeWarsHighAndLow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighAndLow {

	
	public static void main(String[] args) {
		
		String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
		
		String[] arrayNumber = numbers.split(" ");
		
		List<Integer> listNumbers = new ArrayList<Integer>();
		
		for(String number : arrayNumber) {
			
			int intNumber = Integer.parseInt(number);
			
			listNumbers.add(intNumber);
		}
		
		System.out.println(listNumbers);
		
		 int[] arrayOriginal = listNumbers.stream().mapToInt(Integer::intValue).toArray();
		 
		 for(int i = 0; i < arrayOriginal.length; i++) {
			 
			 //CONTINUAR CODANDO, PARTE QUE VAI PEGAR O MENOR E O MAIOR VALOR
			 
			 //minValue = Math.max()
		 }
		 
		 //DEBUG
		 System.out.println(Arrays.toString(arrayOriginal));
		
		
		
	}
	
	
	
	
	public static String highAndLow(String numbers) {
	    // Code here or
	    return "throw towel";
	  }
	
}


//INCOMPLETO