package testesCodeWarsConvertStringToUppercase;

//CONVERTA A STRING PARA UMA STRING EM UPPERCASE

public class ConvertToUpper {
	
	public static void main(String[] args) {
		
		String txt = "1,2,3 hello world!";
		
		System.out.println(makeUpperCase(txt));
		
		
	}
	
	
	public static String makeUpperCase(String str) {
		
		
		
		String strUpper = str.toUpperCase();
		
		return strUpper;
	}
	
	
	
}
//COMPLETA