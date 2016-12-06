package Inheritance;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		B c = new B();
		B d = (B) b;
		B e = c;
		a.f("");
		b.f("");
		b.f("","");
		c.f("");
		c.f("","");
		d.f("");
		e.f("");
		}
}
