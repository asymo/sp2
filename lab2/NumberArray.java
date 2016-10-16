import java.util.ArrayList;
import java.util.Scanner;

public class NumberArray {
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		boolean cont = true;
		while(cont){
			System.out.print("Enter an integer. -1 to stop: ");
			int a = s.nextInt();
			if(a == -1){
				cont = false;
			} else {
				numbers.add(a);
			}
		}
		System.out.println(numbers);
		
		// a, number of elements entered into ArrayList
		System.out.println("Elements entered: " + numbers.size());
		
		// b, average of elements
		int total = 0;
		for(int i = 0; i < numbers.size(); i++){
			total += numbers.get(i);
		}
		System.out.println("Average of ArrayList: " + ((double)total / numbers.size()));
		
		// c, standard deviation (a quantity expressing how much the members of a group differ from the mean value of the group)
		double sd = standardDeviation(numbers);
		System.out.println("Standard Deviation: " + sd);
	}
	
	public static double standardDeviation(ArrayList<Integer> a){
		// find mean
		int m = mean(a);
		double sumDeviations = 0;
		for(int i = 0; i < a.size(); i++){
			// distance from each point to mean
			int x = a.get(i) - m;
			// squared value of deviation added to
			sumDeviations += Math.pow(x, 2);
		}
		sumDeviations = sumDeviations / a.size();
		sumDeviations = Math.sqrt(sumDeviations);
		return sumDeviations;
	}
	
	public static int mean(ArrayList<Integer> a){
		int total = 0;
		for(int i = 0; i < a.size(); i++){
			total += a.get(i);
		}
		System.out.println("Mean: " + (total / a.size()));
		return total / a.size();
	}
}
