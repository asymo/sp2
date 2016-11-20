package pair;

public class PairTest {
	public static void main(String[] args){
		Pair<Integer> pair1 = new Pair<Integer>(42,33);
		int a = pair1.getFirst();
		System.out.println("Obj1 is: " + a);
		
		int b = pair1.getSecond();
		System.out.println("Obj2 is: " + b);
	}
}
