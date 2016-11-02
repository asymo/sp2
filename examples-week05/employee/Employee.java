public class Employee extends Person {
	private double hourlyWage;
	
	// cons
	
	public Employee(String name) {
		// call constructor of parent class
		super(name);
	}
	
	public void pay(double hoursWorked) {
		System.out.println("Pay: " + name + " GBP" + hoursWorked * hourlyWage);
	}
}
