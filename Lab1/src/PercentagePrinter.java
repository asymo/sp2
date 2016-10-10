
public class PercentagePrinter {
	public static void main(String[] args) {
		double probability = 8.70;
		//int percentage = (int) (100 * probability);
		// without rounding answer is 896
		int percentage = (int)Math.round(100 * probability);
		System.out.println(percentage);
	}
}