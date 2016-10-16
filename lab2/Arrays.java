
public class Arrays {
	public static void main(String[] args){
		// a, create array
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		// b, print length
		System.out.println(x.length);
		System.out.println();
		
		// c, print first array item
		System.out.println(x[0]);
		System.out.println();
		
		// d, print last item of array using index number
		System.out.println(x[8]);
		System.out.println();
		
		// e, print last element of array
		System.out.println(x[x.length -1]);
		System.out.println();
		
		// f, print all array elements using a for loop
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// g, print all elements in array with labels
		for(int i = 0; i < x.length; i++){
			System.out.println("Index " + i + " = " + x[i]);
		}
		System.out.println();
		
		// h, print all elements with labels in reverse order
		for(int i = 1; i <= x.length; i++){
			System.out.println("Index " + (x.length - i) + " = " + x[x.length - i] );
		}
		System.out.println();
		
		/* i, print elements of array using enhanced for loop
		 * for(double element : array){ System.out.println(element);}
		 */
		for(double a : x){
			System.out.print(a + ", ");
		}
		System.out.println();
	}
}
