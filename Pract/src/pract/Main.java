package pract;

class A {

	int id = 22;
	String name = "Nazz";
	static String schoolname = "vartak";

	void meth() {
		System.out.println(id);
		System.out.println(name);

	}

	static void meth1() {

		System.out.println(schoolname);

	}

}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.meth();
		A.meth1();
	}
}
