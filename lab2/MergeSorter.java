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

		ArrayList<Integer> newArr = mergeSort(arr);

		System.out.print("Ordered array: ");
		System.out.println(newArr);
	}

	public static ArrayList<Integer> mergeSort(ArrayList<Integer> a) {
		// if ArrayList passed through is empty or has one element
		if (a.size() <= 1) {
			return a;
		}
		

		ArrayList<Integer> firstComparable = new ArrayList<Integer>();
		ArrayList<Integer> secondComparable = new ArrayList<Integer>();

		for (int i = 0; i < a.size(); i++) {
			if (i < a.size() / 2) {
				firstComparable.add(a.get(i));
			} else {
				secondComparable.add(a.get(i));
			}
		}

		System.out.println("Comparable1 " + firstComparable);
		System.out.println("Comparable2 " + secondComparable);

		ArrayList<Integer> firstSorted = new ArrayList<Integer>();
		ArrayList<Integer> secondSorted = new ArrayList<Integer>();

		firstSorted = mergeSort(firstComparable);
		secondSorted = mergeSort(secondComparable);

		System.out.println("Start sort, 1st: " + firstSorted + " 2nd: " + secondSorted);

		// sort
		/*for (int i = 0; i < secondSorted.size(); i++) {
			int j = 0;
			System.out.println("Loop1 " + j);
			while (j < secondSorted.size()) {
				if (secondSorted.get(i) > firstSorted.get(j)) {
					System.out.println("Loop++");
					j++;
				}
				System.out.println("While " + j);
			}
			System.out.println("Loop2 " + j);
			firstSorted.add(j, secondSorted.get(i));
		}*/
		
		if(firstSorted.get(0) > secondSorted.get(0)){
			firstSorted.add(0, secondSorted.get(0));
		} else {
			firstSorted.add(secondSorted.get(0));
		}

		System.out.println("Sorted " + firstSorted);

		return firstSorted;
	}
}
