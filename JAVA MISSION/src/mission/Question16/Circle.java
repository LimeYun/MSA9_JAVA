package mission.Question16;

public class Circle extends Shape{

	double radius;
	
	@Override
	double area() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	double round() {
		return Math.PI*radius*2;
	}

	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
