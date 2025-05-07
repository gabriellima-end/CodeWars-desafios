package testesCodeWarsPhoneNumber;

import java.util.Arrays;


//GERE UM NUMERO DE TELEFONE A PARTIR DE UMA LISTA 
// EXEMPLO {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
public class PhoneNumberGenerate {
	
	public static void main(String[] args) {
		
		int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		String resultado = createPhoneNumber(numero);
		
		
		System.out.println(resultado);
		
	}
	
	public static String createPhoneNumber(int[] numbers) {
	    
		String format = String.valueOf(numbers);
		
		String numFormatString = "("+format.substring(0,3)+") "+format.substring(3,6)+"-"+format.substring(6,10);
	    
	    return numFormatString;
	  }
	
}
//INCOMPLETO