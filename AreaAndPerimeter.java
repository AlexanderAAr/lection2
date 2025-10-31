package trianglescalculations;
import pack1.*;
import pack3.*;
public class AreaAndPerimeter {
	static double[] areaAndPerimeter(Triangle tr) {
		return new double[]{tr.perimeter(), tr.square()};
	}
	public static void main(String[] args ) {
		Triangle tr1 = new Triangle(3.0, 4.0, 5.0);
		System.out.println(tr1.count);
		Triangle tr2 = new Triangle(3.0, 6.0, 5.0);
		System.out.println(tr2.count);
		System.out.println(tr1.count);
		System.out.println("Now in new branch");
	}
}
