package testesCodeWarsSomaArrayPosNeg;

import java.lang.reflect.Array;

//VC TERÁ UM ARRAY, COM NÚMEROS NEGATIVOS E NÚMEROS POSITIVOS, VC VAI SOMAR OS NUMEROS NEGATIVOS
//E CONTAR A **QUANTIDADE** DE NUMEROS POSITIVOS
//EXEMPLO ; [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

public class SomaPosNeg {

	public static void main(String[] args) {
		
		int[] arrayNum = {};
		
		int[] result = countPositivesSumNegatives(arrayNum);
		
		System.out.println(result[0]);
		System.out.println(result[1]);

	}
	
	public static int[] countPositivesSumNegatives(int[] input){
		
		int contaNumPos = 0;
		int somaNumNeg = 0;
		
		//TESTANDO ESSA STRING
		while(true) {
		if(input.equals(null)) {
			
			int[] emptyArray = {};
			
			return emptyArray;
			
			}
		break;
		}
		//-------------------------
		for(int numero : input) {
			
			if(numero>=1) {
				
				contaNumPos ++;
				
			}else if(numero<1){
				
				somaNumNeg += numero;
		
			}
			
		}
		
        return new int[]{contaNumPos, somaNumNeg};
    }
	
}

//INCOMPLETO