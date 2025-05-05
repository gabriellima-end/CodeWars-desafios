package testesCodeWarsPaperwork;


//SUA TURMA PEDE PRA VC COPIAR UMA PAPELADA, VC SABE A QUANTIDADE DE "n" PAPELADAS E "m" COLEGAS DE CLASSE
//EXEMPLO  n=5 m=5 --> 25
//         n=-5 m=5 --> 0

public class PaperWorkCalc {

	public static void main(String[] args) {
		
		int num1 = 5;
		
		int num2 = 5;
		
		System.out.println(paperWork(num1, num2));
		
	}
	
	
	public static int paperWork(int n, int m) {
		
		int calc = n * m;
		
		while(true) {
			
			if(n<0 || m<0) {
				
				n=0;
				m=0;
				
			int numZero = 0;
			
			  return numZero;
			}
			
			break;
			
		}
		
		return calc;
	}
	
}

//COMPLETO

