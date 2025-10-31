package pack1;
public class Triangle {
	public static int count = 0;
	private double a, b, c;
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		count++;
	}
	Triangle() {
		a = 7.0; b = 7.0; c = 7.0;
	}
	Triangle(double c) {
		this();
		this.c = c;
	}
	
	public double perimeter() {
		return (a+b+c);
	}
	private double semiPerimeter() {
		return perimeter()/2;
	}
	public double square() {
		return Math.sqrt(semiPerimeter()*(semiPerimeter()-a)*(semiPerimeter()-b)*(semiPerimeter()-c));
	}
	public double getA() { return a;} public double getB() { return b;} public double getC() { return c;}
	public void setA(double x) { a = x;} public void setB(double x) {b = x;} public void setC(double x) {c = x;}
}