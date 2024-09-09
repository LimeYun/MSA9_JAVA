package mission.Question10;

public class Rectangle extends FigureTest {

	double width, height;
	
	
	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public double getArea() {
		return width * height;
	}
	
	
	
	

}
