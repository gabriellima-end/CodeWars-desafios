package testesCodeWarsStringToArrayString;

//CONVERTA UMA FRASE EM UM ARRAY DE PALAVRAS

import java.util.Arrays;

public class ConvertStringToArrayOfString {

	public static void main(String[] args) {
		
		String txt = "I love arrays they are my favorite";
		
		String[] formatado = stringToArray(txt);
		
		System.out.println(Arrays.toString(formatado));
	}
	
	
	public static String[] stringToArray(String s) {
		
		String delimiter = " ";
		
		String[] frase = s.split(delimiter);
		
		
		return frase;
	}
	
}
//COMPLETO