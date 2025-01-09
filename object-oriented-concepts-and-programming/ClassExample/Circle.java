package objectNclass;

public class Circle {
	public static int objectCount = 0;
	final static double localPI = Math.PI;
	double radius = 1.00;
	Circle(){
		
	}
	// Constructor
	Circle(double newRadius){
		radius = newRadius;
		objectCount++;
	}
	public double getArea(){
		return localPI * Math.pow(radius, 2);
	}
}
