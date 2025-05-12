package testesCodeWarsComputeDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComputeDifference {

	
	public static void main(String[] args) {
		
		int[] listaUm = {1,2,3,4,5};
		int[] listaDois = {1,2,3,4,5,6,7,8};
		
		boolean teste = listaUm.equals(listaDois);
		
		if(!teste) {
			
			
			
		}
		
		System.out.println(teste);
		
		//System.out.println(arrayDiff(listaUm, listaDois));
		
	}
	
	
	public static int[] arrayDiff(int[] a, int[] b) {
	    
	    List<Integer> resposta = new ArrayList<>();
		boolean igualdade = a.equals(b);

		
		if(igualdade) {
			
			List<Integer> intListA = Arrays.stream(a).boxed().collect(Collectors.toList());
			List<Integer> intListB = Arrays.stream(b).boxed().collect(Collectors.toList());
			
			
			//PEGANDO ELEMENTOS UNICOS DA LISTA A
			for(int elemento : intListA) {
				
				if(!intListB.contains(elemento)) {
					
					resposta.add(elemento);
					
				}
			}
			
			//PEGANDO ELEMENTOS UNICOS DA LISTA B
			//DESENVOLVER
		
		}
		
			
		
	    return a;
	}
}

//INCOMPLETO
