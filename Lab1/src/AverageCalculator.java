
public class AverageCalculator {
	public static void main(String[] args) {
		int age1 = 18;
		int age2 = 35;
		int age3 = 50;
		int age4 = 44;
		double averageAge = (double)(age1 + age2 + age3 + age4) / 4;
		// without (double) answer is 36
		System.out.println(averageAge);
	}
}
