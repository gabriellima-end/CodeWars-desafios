package testesCodeWarsFindTheOddInt;

import java.util.HashMap;
import java.util.Map;

//TEM QUE RETORNAR O NUMERO DO ARRAY QUE APARECE UM NUMERO ÍMPAR DE VEZES

public class FindTheOddInt {
	
	public static void main(String[] args) {
		
		int[] arrayNumber = {0};
		
		System.out.println(findIt(arrayNumber));
		
//		//INSTANCIANDO O HASHMAP 
//		Map<Integer, Integer> contador = new HashMap<>();
//		
//		//DANDO PUT NO CONTADOR COM A KEY SENDO O NUM E O VALOR SENDO A CONTAGEM
//		for(int num : arrayNumber) {
//			
//			contador.put(num, contador.getOrDefault(num, 0) + 1);
//			
//		}
//		
//		//CAPTURANDO O VALOR QUE SEJA ÍMPAR
//		for(Map.Entry<Integer,Integer> entry : contador.entrySet()) {
//			
//			if(entry.getValue() % 2 != 0) {
//				
//				System.out.println(entry.getKey());
//				
//			}
//			
//		}
		
		
	}
	
	
	public static int findIt(int[] a) {
		
		Map<Integer,Integer> count = new HashMap<>();
		
		for(int num : a) {
			
			count.put(num, count.getOrDefault(num, 0) + 1);
			
		}
		
		int result = 0;
		
		for(Map.Entry<Integer,Integer> entry : count.entrySet()) {
			
			if(entry.getValue() % 2 != 0) {
				
				result = entry.getKey();
				
			}
		}
		
		return result;
        
    }
	
}
