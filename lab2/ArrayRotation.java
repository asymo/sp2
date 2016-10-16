
public class ArrayRotation {
	public static void main(String[] args) {
		double[] x = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
		System.out.println("Before rotation: ==============================");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]: " + x[i]);
		}
		x = rotate(x, 3);
		System.out.println("After rotation: ==============================");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]: " + x[i]);
		}
	}

	public static double[] rotate(double[] a, int b) {
		// if the int b is a negative number
		if(b < 0){
			b = a.length + b;
			System.out.println("B = " + b);
		}
		double[] rotated = a;
		for (int j = 1; j <= b; j++) {
			double y = rotated[0];
			for (int i = 0; i < rotated.length; i++) {
				if (i != 0) {
					rotated[i - 1] = rotated[i];
				}
			}
			rotated[rotated.length - 1] = y;
		}
		return rotated;
	}
}
