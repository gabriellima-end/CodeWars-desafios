package testesCodeWarsRemoveFirstAndLast;

//REMOVA O PRIMEIRO E O ÚLTIMO CARACTERE DE UMA PALAVRA


public class RemoveFirstAndLast {

	public static void main(String[] args) {
		
		String palavra = "country";
		
		System.out.println(remove(palavra));
	}
	
	public static String remove(String str) {
		
		String removeFirstAndLast = str.substring(1, str.length()-1);
		
		return removeFirstAndLast;
	}
	
}
//COMPLETO