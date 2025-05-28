package testesCodeWarsCenturyFromYear;

import java.util.Arrays;

public class CenturyFromYear {

	public static void main(String[] args) {
		
		int number = 201;
		
		System.out.println(century(number));
	}
	
	public static int century(int number) {
		
		return (number + 99) / 100;
	}
	
}
