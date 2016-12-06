package Inheritance;

public class B extends A {
	public void f(String s) {
		System.out.println("B String");
	}

	public void f(Object s) {
		System.out.println("B Object");
	}

	public void f(Object s, Object t) {
		System.out.println("B Object Object");
	}

	public void f(String s, String t) {
		System.out.println("B String String");
	}

	public void g() {
		System.out.println("I'm of type B!");
	}
}
