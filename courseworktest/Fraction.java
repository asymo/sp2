
import java.math.*;

public class Fraction{
	private BigInteger numerator;
	private BigInteger denominator;
	
	public Fraction(BigInteger a, BigInteger b){
		BigInteger x = a.gcd(b);
		this.numerator = a.divide(x);
		this.denominator = b.divide(x);
	}
	
	public void getValues() {
		System.out.println("Num: " + numerator.toString());
		System.out.println("Denom: " + denominator.toString());
	}
}
