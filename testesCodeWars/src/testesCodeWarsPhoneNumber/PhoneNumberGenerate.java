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
	    
		StringBuilder format = new StringBuilder();
		
		format.append("(");
		for(int i = 0; i<3 ; i++) {	
			format.append(numbers[i]);			
		}
		
		format.append(") ");
		for(int i = 3; i<6; i++) {	
			format.append(numbers[i]);	
		}
		
		format.append("-");
		for(int i = 6; i<10; i++) {	
			format.append(numbers[i]);
		}
	    
	    return format.toString();
	  }
	
}
//INCOMPLETO