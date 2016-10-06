import java.util.Scanner;

public class LowNumber {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first int: ");
		int a = in.nextInt();
		System.out.print("Enter second int: ");
		int b = in.nextInt();
		System.out.println("Lowest number is: " + Math.min(a, b));
		in.close();
	}
}
