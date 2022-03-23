package pract;

class B {

	void meth(int a) {
		System.out.println(a);
	}

	void meth(int a, int b) {
		System.out.println(a + b);
	}

}

public class Main_1 {
	public static void main(String[] args) {
		B b = new B();
		b.meth(25);
		b.meth(25, 25);
	}

}
