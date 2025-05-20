package testesCodeWarsHighAndLow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighAndLow {

	
	public static void main(String[] args) {
		
		String numbers = "1 9 3 4 -5";
		
		System.out.println(highAndLow(numbers));

//---------PARTE DO CÓDIGO FEITA NA MAIN PARA VISUALIZAR MELHOR OS DEBUGS----------//
//		String[] arrayNumber = numbers.split(" ");
//		
//		List<Integer> listNumbers = new ArrayList<Integer>();
//		
//		for(String number : arrayNumber) {
//			
//			int intNumber = Integer.parseInt(number);
//			
//			listNumbers.add(intNumber);
//		}
//		
//		//DEBUG
//		//System.out.println(listNumbers);
//		
//		 int[] arrayOriginal = listNumbers.stream().mapToInt(Integer::intValue).toArray();
//		 
//		 int menor = arrayOriginal[0];
//		 int maior = arrayOriginal[0];
//		 
//		 for(int i = 0; i < arrayOriginal.length; i++) {
//			 
//			 if(arrayOriginal[i] < menor) {
//				 
//				 menor = arrayOriginal[i];
//				 
//			 }
//			 
//			 if(arrayOriginal[i] > maior) {
//				 
//				 maior = arrayOriginal[i];
//				 
//			 }
//			 
//		 }
//		 
//		 StringBuilder resultadoFinal = new StringBuilder();
//		 
//		 resultadoFinal.append(maior);
//		 resultadoFinal.append(" " + menor);
//		
//		 //DEBUG
//		 System.out.println(resultadoFinal);

	}
	
	public static String highAndLow(String numbers) {
		
		String[] arrayNumber = numbers.split(" ");
		
		List<Integer> listNumbers = new ArrayList<Integer>();
		
		for(String number : arrayNumber) {
			
			int intNumber = Integer.parseInt(number);
			
			listNumbers.add(intNumber);
			
		}
		
		int[] arrayOriginal = listNumbers.stream().mapToInt(Integer::intValue).toArray();
		
		int maior = arrayOriginal[0];
		
		int menor = arrayOriginal[0];
		
		for(int i = 0; i < arrayOriginal.length; i++) {
			
			if(arrayOriginal[i] < menor) {
				
				menor = arrayOriginal[i];
				
			}
			
			if(arrayOriginal[i] > maior) {
				
				maior = arrayOriginal[i];
				
			}
			
		}
		
		StringBuilder resultadoFinal = new StringBuilder();
		
		resultadoFinal.append(maior);
		resultadoFinal.append(" "+ menor);
		
		
		
		
	    return resultadoFinal.toString();
	  }
	
}


//COMPLETO