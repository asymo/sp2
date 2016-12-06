package pair;

public class PairTest {
	public static void main(String[] args){
		//Test 1 for Object
		/*Object a = pair1.getFirst();
		System.out.println("Obj1 is: " + a);
		
		Object b = pair1.getSecond();
		System.out.println("Obj2 is: " + b);
		
		Pair pair2 = pair1.swap();
		Object c = pair2.getFirst();
		Object d = pair2.getSecond();
		
		System.out.println("Swap 1st: " + c);
		System.out.println("Swap 2nd: " + d);
		
		Pair pair3 = new Pair(pair2);
		Object e = pair3.getFirst();
		System.out.println("Obj1(p3) is: " + e);
		
		Object f = pair3.getSecond();
		System.out.println("Obj2(p3) is: " + f);
		*/
		
		Pair<Integer, String> pair1 = new Pair<Integer, String>(43,"hello");
		
		Integer a =pair1.getFirst();
		String b = pair1.getSecond();
		
		System.out.println("Obj1: " + a);
		System.out.println("Obj1: " + b);
		
		Pair<String, Integer> pair2 = pair1.swap();
		
		String c = pair2.getFirst();
		Integer d = pair2.getSecond();
		
		System.out.println("Obj1(pair2): " + c);
		System.out.println("Obj1(pair2): " + d);
		
		Pair<String, Number> pair3 = new Pair<String, Number>(pair2);
		/* this would work as in Pair class we say D can be a subclass of they type that is passed
		 * eg. integer is subclass of number, so pair2 can be passed into pair3 
		 */
	}
}