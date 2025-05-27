package testesCodeWarsReverseArray;

import java.util.Arrays;

//O MÉTODO RECEBERÁ ALGUNS VALORES INT E TERÁ QUE RETORNAR UM ARRAY, PORÉM COM A ORDEM INVERTIDA
//EXEMPLO 35231 => [1,3,2,5,3]
//0     => [0]

public class ReverseArray {

	public static void main(String[] args) {
		
		long numeros = 0;
		
		int[] formatado = digitize(numeros);
		
		System.out.println(Arrays.toString(formatado));
		
	}
	
	public static int[] digitize(long n) {
		
		String numeroString = String.valueOf(n);
		
		int tamanhoValor = numeroString.length();
		
		StringBuffer reverse = new StringBuffer(numeroString);
		
		StringBuffer numeroConvert = reverse.reverse();
		
		String resultadoInvertido = String.valueOf(numeroConvert);
		
		String[] dividido = resultadoInvertido.split("");
		
		int[] arrayReverse = new int[tamanhoValor];
		
		for(int i = 0; i<tamanhoValor; i++) {
			
			arrayReverse[i] = Integer.parseInt(dividido[i]);
			
		}
		
		return arrayReverse;
	  }
	
}

//COMPLETO

