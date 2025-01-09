package objectNclass;

public class Rectangle {
	double width = 0.0;
	double height = 0.0;
	Rectangle(){
		width = 1.0;
		height = 1.0;
	}
	Rectangle(double nWidth,double nHeight){
		width = nWidth;
		height = nHeight;		
	}
	
	public double getArea(){
		return width*height;
	}
}
