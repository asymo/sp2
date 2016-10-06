
public class Expressions {
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 17;
		System.out.println((a + b) / c);
		// 3 and 4 are added with sum 7
		// 7 is divided by 5 with quotient 1
		System.out.println(a + b / c);
		// 4 is divided by 5 with quotient 0
		// 3 is added with 0 sum 3
		System.out.println(a++);
		// 3 is printed in incremented by 1
		System.out.println(a--);
		// 4 is printed then decreased by 1
		System.out.println(a + 1);
		// 3 and 1 are added with sum 4
		System.out.println(d % c);
		// 17 modulo 5 with remainder 2
		System.out.println(d / c);
		// 17 divided by 5 with quotient 3
		System.out.println(d + a / d + b);
		// 3 is divided 17 with quotient 0
		// 17 is add to 0 with sum 17
		// 4 is added to 17 with sum 21
		System.out.println((d + a) / (d + b));
		// 17 is add to 3 with sum 20
		// 17 is add to 4 with sum 21
		// 20 is divided by 21 with quotient 0
		System.out.println(Math.sqrt(b));
		// square root of 4 equals 2
		System.out.println(Math.pow(a, b));
		// 3 to the power 4 equals 81
		System.out.println(Math.abs(-a));
		// returns absolute number of 3 decremented by 1, equals 2
		System.out.println(Math.max(a, b));
		// returns greater value of 3 and 4, which is 4
	}
}
