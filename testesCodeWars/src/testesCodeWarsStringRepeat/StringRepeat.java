package testesCodeWarsStringRepeat;

public class StringRepeat {
	
	public static void main(String[] args) {
		
		String word = "I";
		
		int timeRepeat = 5;
		
		System.out.println(repeatStr(timeRepeat, word));
		
	}
	
	public static String repeatStr(final int repeat, final String string) {
		
		String result = string.repeat(repeat);
		
		return result;
    }
	
}
