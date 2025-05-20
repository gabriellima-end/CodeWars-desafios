package testesCodeWarsReverseFiveLetters;

import java.util.Arrays;

public class ReverseFiveLetterOrMore {

	
	public static void main(String[] args) {
		
		String sentence = "just [kidding there is] still one more";
		
		System.out.println(spinWords(sentence));
		
//---------PARTE DO CÓDIGO FEITA NA MAIN PARA VISUALIZAR MELHOR OS DEBUGS----------//		
//		String[] sentenceSplited = sentence.split(" ");
//		
//		StringBuilder finalSentence = new StringBuilder();
//		
//		for(String word : sentenceSplited) {
//			
//			if(word.length() < 5) {
//				
//				finalSentence.append(word + " ");
//				
//			}
//			
//			if(word.length() >= 5) {
//				
//				if(!word.matches("[a-zA-Z]+")) {
//					
//					StringBuffer sentenceReverse = new StringBuffer(word);
//					
//					StringBuffer reverseSentence = sentenceReverse.reverse();
//					
//					String[] wordSplited = reverseSentence.toString().split("");
//					
//					//ULTIMO ELEMENTO DO ARRAY (SERÁ SEMPRE "[")
//					String lastCaracter = wordSplited[wordSplited.length -1 ];
//					
//					//ARRASTANDO OS OUTROS ELEMENTOS PARA UM INDICE A DIREITA
//					for(int i = wordSplited.length -1; i>0; i-- ) {
//						
//						wordSplited[i] = wordSplited[i -1];
//						
//					}
//					
//					//ADICIONANDO O ELEMENTO QUE ESTAVA EM ULTIMO, NO INDICE 0
//					wordSplited[0] = lastCaracter;
//					
//					finalSentence.append(Arrays.toString(wordSplited).replace(" ","").replace(",", "").replace("[[", "[").replace("]", "").trim()+" ");
//					
//				}else {
//					
//					StringBuffer sentenceReverse = new StringBuffer(word);
//				
//					StringBuffer reverseSentence = sentenceReverse.reverse();
//					
//					finalSentence.append(reverseSentence + " ");
//				}
//			}
//			
//		}
//		
//		System.out.println(finalSentence.toString().trim());
//-------------------------------------------------------------------------------//
	}
	
	public static String spinWords(String sentence) {
	    
		String[] sentenceSplited = sentence.split(" ");
		
		StringBuilder finalSentence = new StringBuilder();
		
		for(String word : sentenceSplited) {
			
			if(word.length() < 5) {
				
				finalSentence.append(word + " ");
				
			}
			
			if(word.length() >= 5) {
				
				if(!word.matches("[a-zA-Z]+")) {
					
					StringBuffer sentenceReverse = new StringBuffer(word);
					
					StringBuffer reverseSentence = sentenceReverse.reverse();
					
					String[] wordSplited = reverseSentence.toString().split("");
					
					//ULTIMO ELEMENTO DO ARRAY (SERÁ SEMPRE "[")
					String lastCaracter = wordSplited[wordSplited.length -1 ];
					
					//ARRASTANDO OS OUTROS ELEMENTOS PARA UM INDICE A DIREITA
					for(int i = wordSplited.length -1; i>0; i-- ) {
						
						wordSplited[i] = wordSplited[i -1];
						
					}
					
					//ADICIONANDO O ELEMENTO QUE ESTAVA EM ULTIMO, NO INDICE 0
					wordSplited[0] = lastCaracter;
					
					finalSentence.append(Arrays.toString(wordSplited).replace(" ","").replace(",", "").replace("[[", "[").replace("]", "").trim()+" ");
					
				}else {
					
					StringBuffer sentenceReverse = new StringBuffer(word);
				
					StringBuffer reverseSentence = sentenceReverse.reverse();
					
					finalSentence.append(reverseSentence + " ");
				}
				
			}
			
		}
		
		return finalSentence.toString().trim();
	  }
	
}
