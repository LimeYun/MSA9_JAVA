package mission.Question10;

public class Circle extends FigureTest {

	double radius;
	
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double getArea() {
		return Math.PI*(Math.pow(radius,2));
	}
	
	

}
