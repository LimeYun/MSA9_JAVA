package mission.Question16;

public class Triangle extends Shape{

	double width, height;
	
	//생성자
	public Triangle() {
		this(0.0, 0.0);
	}
	
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	@Override
	double area() {
		// 삼각형의 넓이 = (가로)x(높이)/2
		return width * height/2;
	}


	@Override
	double round() {
		// 삼가형의 둘레 = 한변의 길이 *3
		return width * 3;
	}

	//getter, setter

	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	//toString
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}
