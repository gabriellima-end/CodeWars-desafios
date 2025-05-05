package testesCodeWars;

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
