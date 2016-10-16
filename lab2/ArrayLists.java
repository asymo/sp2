import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names);
		
		// a
		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		System.out.print("names added: ");
		System.out.println(names);
		
		//b 
		System.out.println("First element: " + names.get(0));
		System.out.println("Last element: " + names.get(7));
		
		// c
		System.out.println("Array size: " + names.size());
		
		// d
		System.out.println("Last element using size: " + names.get(names.size() - 1));
		
		// e
		names.set(0, "Alice B Toklas");
		System.out.println("Change to Alice: " + names);
		
		// f, select the position in the array you wish to add element. Everything after moves up an element
		names.add(4, "Doug");
		System.out.println("Added Doug: " + names);
		
		// g
		for(String x : names){
			System.out.println(x);
		}
		
		// h
		ArrayList<String> names2 = new ArrayList<String>(names);
		System.out.println("names2: " + names2);
		
		// i
		names.remove(0);
		System.out.println("names[0] removed: " + names);
		System.out.println("names2: " + names2);
	}
}
