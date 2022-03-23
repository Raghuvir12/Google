package pract;

class C {
	void meth(int a) {
		System.out.println(a);
	}

	void meth1(int a, int b) {
		System.out.println(a / b);
	}

	void meth3(int a, int b, int c) {

		System.out.println(a + b - c);
	}

	void meth4(int a, int b, int c, int d) {

		System.out.println(a * b * c * d);
	}

}

class D extends C {

	
	

void meth3(int a, int b, int c) {

		System.out.println(a + b - c);
	}

	void meth4(int a, int b, int c, int d) {

		System.out.println(a * b * c * d);
	}

}

public class Main_2 {
	public static void main(String[] args) {
		D d = new D();
		d.meth(25);
		d.meth1(5, 10);
		d.meth3(25, 20, 15);
		d.meth4(12, 15, 55, 16);

		
	}
}
