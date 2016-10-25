import java.util.ArrayList;

public class MergeSorter {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(13);
		arr.add(47);
		arr.add(200);
		arr.add(53);
		arr.add(0);
		arr.add(100);
		arr.add(33);
		arr.add(8);
		arr.add(31);
		arr.add(75);
		arr.add(123);
		arr.add(47);
		arr.add(99);
		
		ArrayList<Integer> newArr = mergeSort(ArrayList<Integer> arr);
	}
	
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> a){
		// if ArrayList assed through is empty or has one element
		if(a.size() <= 1){
			return a;
		}
		
		ArrayList<Integer> firstComparable = new ArrayList<Integer>();
		ArrayList<Integer> secondComparable = new ArrayList<Integer>();
		
		for(int i = 0; i < a.size(); i++){
			if(i < a.size() / 2){
				firstComparable.add(a.get(i));
			} else {
				secondComparable.add(a.get(i));
			}
		}
		
	
		
	}
}
