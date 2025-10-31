package pack2;
import pack3.*;
import pack1.Triangle; 
public class Main extends Triangle {
	Main(double a, double b, double c) {
		super(a, b, c);
	}
	public static void main(String[] args) {
		IsoscelesTriangle tr = new IsoscelesTriangle(10.0, 16.0);
		Main tr1 = new Main(3.0, 4.0, 5.0);
		System.out.println(tr1.perimeter());
		//tr.setA(3.0); tr.setB(4.0); tr.setC(5.0);
		System.out.println(tr.square());
	}
}