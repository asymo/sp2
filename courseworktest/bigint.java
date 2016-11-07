

import java.math.*;

public class bigint {
	public static void main(String[] args){
		BigInteger a = new BigInteger("25");
		BigInteger b = new BigInteger("5");
		/*BigInteger c = a.gcd(b);
		BigInteger d = a.divide(c);
		BigInteger e = b.divide(c);
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);*/
		
		Fraction gh = new Fraction(BigInteger.ONE,new BigInteger("123456789012345678901234567890"));
		gh.getValues();
	}
	
	
}

