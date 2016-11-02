public class Person {
	// fields with access modifiers
	protected String name;
	protected int age;
	
	// constructor
	public Person(String name) {
		this.name = name;
		age = 0;
	}
	
	// methods
	
	public String getName() {
		return name;
	}
	
	public void birthday() {
		age++;
		System.out.println("Happy birthday!");
	}
}
