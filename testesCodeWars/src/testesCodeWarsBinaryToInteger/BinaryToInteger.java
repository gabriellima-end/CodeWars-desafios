package testesCodeWarsBinaryToInteger;

import java.util.Arrays;
import java.util.List;

public class BinaryToInteger {

	public static void main(String[] args) {
		
		List<Integer> binaryNumber = Arrays.asList(0, 0, 1, 0);
		
		System.out.println(ConvertBinaryArrayToInt(binaryNumber));
	
	}
	
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		
		StringBuilder convertBinary = new StringBuilder();
		
		for(int elemento : binary) {
			
			convertBinary.append(elemento);
			
		}
		
		String convertBinaryString = convertBinary.toString();
		
		int binaryFinal = Integer.parseInt(convertBinaryString, 2);
		
		return binaryFinal;
		
    }
	
	
	
}

//COMPLETO
