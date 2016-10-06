
public class HelloPrinter {
	public static void main(String[] args){
		System.out.println("Hello World");
		new HelloPrinter().number();
	}
	
	public void number(){
		byte a = 127;
		char b = 'b';
		short c = 25874;
		int d = 125479658;
		long e = 124582574;
		float f = 223458547;
		double g = 2.14564664;
		boolean h = true;
		
		System.out.println("Byte: " + a);
		System.out.println("Char: " + b);
		System.out.println("Short: " + c);
		System.out.println("Int: " + d);
		System.out.println("Long: " + e);
		System.out.println("Float: " + f);
		System.out.println("Double: " + g);
		System.out.println("Boolean: " + h);
		
		a = 57;
		b = 'K';
		c = 4275;
		d = 123456789;
		e = 124585245;
		f = 15547845;
		g = 2574.25685455445555;
		h = false;
		
		System.out.println("Byte: " + a);
		System.out.println("Char: " + b);
		System.out.println("Short: " + c);
		System.out.println("Int: " + d);
		System.out.println("Long: " + e);
		System.out.println("Float: " + f);
		System.out.println("Double: " + g);
		System.out.println("Boolean: " + h);
		
		final byte aa = 127;
		final char bb = 'b';
		final short cc = 25874;
		final int dd = 125479658;
		final long ee = 124582574;
		final float ff = 223458547;
		final double gg = 2.14564664;
		final boolean hh = true;
		
		System.out.println("Byte final: " + aa);
		System.out.println("Char final: " + bb);
		System.out.println("Short final: " + cc);
		System.out.println("Int final: " + dd);
		System.out.println("Long final: " + ee);
		System.out.println("Float final: " + ff);
		System.out.println("Double final: " + gg);
		System.out.println("Boolean final: " + hh);
		
		/*aa = 3;
		
		System.out.println("New byte final: " + aa);*/
	}
}
