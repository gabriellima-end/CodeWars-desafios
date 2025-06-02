package testesCodeWarsBanjo;

public class AreYouPlayingBanjo {
	
	public static void main(String[] args) {
		
		String name = "Rolf";
		
		System.out.println(areYouPlayingBanjo(name));
		
//		char firstLetter = name.charAt(0);
//		
//		if(firstLetter == 'R' || firstLetter == 'r') {
//			
//			System.out.println(name + " Plays banjo");
//			
//		}else {
//			
//			System.out.println(name + " does not play banjo");
//			
//		}
		
	}
	
	public static String areYouPlayingBanjo(String name) {
		
		char firstLetter = name.charAt(0);
		
		if(firstLetter == 'R' || firstLetter == 'r') {
			
			return name + " plays banjo";
			
		}else {
			
			return name + " does not play banjo";
			
		}
		
	  }
	
}
