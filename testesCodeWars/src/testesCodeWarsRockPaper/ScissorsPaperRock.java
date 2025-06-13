package testesCodeWarsRockPaper;

public class ScissorsPaperRock {

	public static void main(String[] args) {
		
		String p1 = "paper";
		String p2 = "rock";
		
		System.out.println(rps(p1,p2));
		
//		if(p1 == "scissors" && p2 == "paper" || 
//				p1 == "rock" && p2 == "scissors" || 
//				p1 == "paper" && p2 == "rock") {
//			
//			System.out.println("Player 1 won!");
//			
//		} 
//		else if(p1 == "scissors" && p2 == "scissors" || 
//				p1 == "rock" && p2 == "rock" || 
//				p1 == "paper" && p2 == "paper") {
//			
//			System.out.println("Draw!");
//			
//		}
//		else {
//			
//			System.out.println("Player 2 won!");
//		}
		
	}
	
	public static String rps(String p1, String p2) {
		
		if(p1 == "scissors" && p2 == "paper" || 
				p1 == "rock" && p2 == "scissors" || 
				p1 == "paper" && p2 == "rock") {
			
			return "Player 1 won!";
			
		} 
		else if(p1 == "scissors" && p2 == "scissors" || 
				p1 == "rock" && p2 == "rock" || 
				p1 == "paper" && p2 == "paper") {
			
			return "Draw!";
			
		}
		else {
			
			return "Player 2 won!";
		}
		
	}
	
}
