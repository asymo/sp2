import java.util.ArrayList;

public class Genetics {
	public static void main(String[] args){
		
		/*
		 * question 1
		 
		// a)
		Integer[] a = new Integer[10];
		Object[] b;
		b = a;
		b[0] = 42;
		// yes, will compile as Integer is a subclass of Object
		
		// b)
		Integer[] c = new Integer[10];
		Object[] d;
		d = c;
		d[0] = "hi there";
		// yes will compile as the string is being entered into an array of Objects, will crash at run time using a type cast exception
		
		// c)
		Integer[] e = new Integer[10];
		Object[] f;
		f = e;
		e[0] = "hi there"; // incompatible type
		// will not comile as the String is being assigned into an array of Integers
		 * 
		 */
		
		/*
		 * Question 2
		 		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Object> b;
		b = a;
		b.add(42);
		// won't compile as b = a is two different types
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<Object> d;
		d = c;
		d.add("hi there");
		// won't compile as b = a is two different types
		
		ArrayList<Integer> e = new ArrayList<Integer>();
		ArrayList<Object> f;
		f = e;
		e.add("hi there");
		// won't compile, incompatible types on last two lines
		 * 
		 */
		
		/*
		 * Question 3, using wildcards
		 */
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<?> b;
		b = a; //this would compile
		b.add(42);
		// will not compile as Integer is not the same  type as ? (could be any class that extends Object)
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<?> d;
		d = c;
		//d.add("hi there");
		// will not compile as won't add String to unknown type
		
		ArrayList<Integer> e = new ArrayList<Integer>();
		ArrayList<?> f;
		f = e;
		//e.add("hi there");
		// won't compile, incompatible type Integer to String
	}

}
