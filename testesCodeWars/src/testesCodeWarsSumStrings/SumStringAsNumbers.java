package testesCodeWarsSumStrings;

import java.util.Arrays;

public class SumStringAsNumbers {

	public static void main(String[] args) {
		
		String a = "3547412706584186260683171532860";
		String b = "3547412706584186260683171532860";
		
		System.out.println(sumStrings(a,b));
		
		
	}
	
	
    public static String sumStrings(String a, String b) {
        // Remove zeros à esquerda
        a = a.replaceFirst("^0+(?!$)", "");
        b = b.replaceFirst("^0+(?!$)", "");

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;	

            int sum = digitA + digitB + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        return result.reverse().toString();
    }
}

