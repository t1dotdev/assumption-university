package objectNclass;

public class ClassExample {
	public static void main(String[] args){
		new Circle(6.5);
		Circle circle01 = new Circle(4.5);
		System.out.println("There is/are "+Circle.objectCount+ " circle object(s).");
		Circle circle02 = new Circle();
		System.out.println("There is/are "+Circle.objectCount+ " circle object(s).");
		Circle circle03 = new Circle(3.12);
		Rectangle rec01 = new Rectangle();
		System.out.println("The area of the new created rectangle is "+ rec01.getArea());
		System.out.println("There is/are "+Circle.objectCount+ " circle object(s).");
		System.out.println("The area of the first circle object is "+ circle01.getArea());
		System.out.println("The area of the second circle object is "+ circle02.getArea());
		System.out.println("There is/are "+Circle.objectCount+ " circle object(s).");
		
	}
}
