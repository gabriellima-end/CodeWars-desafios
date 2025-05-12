package testesCodeWarsDiamond;

public class CreateADiamond {
	
	public static void main(String[] args) {
		
		int diamondSize = 15;
		
		System.out.println(print(diamondSize));
		
	}
	
	public static String print(int n) {
		
		
		StringBuilder diamante = new StringBuilder();
		int meioLinha = n / 2;
		
		if(!(n % 2 == 0 || n < 0)) {	
				
			for(int i = 0; i<=meioLinha; i++) {
				
				int espacoLinha = meioLinha - i;
				int asterisk = 2 * i + 1;
				diamante.append(" ".repeat(espacoLinha)).append("*".repeat(asterisk)).append("\n");
			}
			
			for(int i = meioLinha - 1; i>=0; i--) {
				int espacoLinha = meioLinha - i;
				int asterisk = 2*i + 1;
				diamante.append(" ".repeat(espacoLinha)).append("*".repeat(asterisk)).append("\n");	
			}
		}else {
			
			return null;
			
		}
		
		//return asteriskFinalFinal;
		return diamante.toString();
    }
	
	
	
}


//COMPLETO