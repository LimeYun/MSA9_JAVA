package mission.Question10;

public class Triangle extends FigureTest {

	double width, height;
	
	//생성자
	public Triangle() {
		this(0.0, 0.0);
	}
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height/2;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	



}
