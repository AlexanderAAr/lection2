class A {
	int f1;
	boolean f2;
	{
		System.out.println("In non-static block");
		System.out.println(f1+" "+f2);
	}
	A(int f1, boolean f2) {
		this.f1 = f1;
		this.f2 = f2;
		System.out.println(f1+" "+f2);
	}
	static {
		System.out.println("In static block");
	}
}
class B extends A {
	{
		System.out.println("In block of class B");
		f1 = 7; f2 = true;
	}
	B(int f1, boolean f2) {
		super(f1, f2);
		System.out.println("Constructor of B");
	}
	static {
		System.out.println("In static block of B");
	}
}
public class Main1 {
	public static void main(String[] args) {
		B obj = new B(7, false);
	}
}