package testesCodeWarsComputeDifference;

import java.util.Arrays;

public class ComputeDifference {

	
	public static void main(String[] args) {
		
		int[] listaUm = {1,2};
		int[] listaDois = {1};
		
		int[] respostaDifference = arrayDiff(listaUm, listaDois);
		
		System.out.println(Arrays.toString(respostaDifference));
		
	}
	
	
	public static int[] arrayDiff(int[] a, int[] b) {
		
		
		
		int contador = 0;
		int indice = 0;
		
		
		for(int elemento : a) {
			boolean countBool = false;
			for(int elementoB : b) {
				
				if(elemento == elementoB) {
					
					countBool = true;
					break;
				}
				
			}
			
			if(!countBool) {
				
				contador++;
			}
		}
		
		int[] resultadoArray = new int[contador];
		
		for(int elemento : a) {
			boolean countBool = false;
			for(int elementoB : b) {
				
				if(elemento == elementoB) {
					
					countBool = true;
					
				}
				
			}
			
			if(!countBool) {
				
				resultadoArray[indice++] = elemento;
				
			}
			
		}
		
		
		
		
		return resultadoArray;
	}
}

//INCOMPLETO
