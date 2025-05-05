package testesCodeWarsPalavraInvertida;

//INVERTA A PALAVRA DE ENTRADA

public class CodeWarsTestPalavraInvertida {
	
	public static void main(String[] args) {
		
		String frase = "world";
		
		solution(frase);
		
		System.out.println(solution(frase));
		
	}
	
	
	public static String solution(String str) {
		
		str = new StringBuilder(str).reverse().toString();
		
		return str ;
	}
	
}

//COMPLETO
//               _ _      
//              (_) |     
//___ _ __ ___  _ | | ___ 
/// __| '_ ` _ \| | |/ _ \
//\__ \ | | | | | | |  __/
//|___/_| |_| |_|_|_|\___|