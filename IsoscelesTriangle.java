package pack3;
import pack1.Triangle;
public class IsoscelesTriangle extends Triangle {
	public IsoscelesTriangle(double a, double b) {
		super(a, a, b);
	}
	@Override
	/**
	@see pack1.Triangle#square()
	*/
    public double square() {
		System.out.println("From isosceles");
		return Math.sqrt(Math.pow(getA(), 2) - Math.pow(getC()/2, 2))*0.5*getC();
	}	
}