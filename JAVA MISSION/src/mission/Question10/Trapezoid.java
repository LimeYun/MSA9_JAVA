package mission.Question10;

public class Trapezoid extends FigureTest {

	double top, bottom, height;

	public Trapezoid() {
	}

	public Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	}

	public double getArea() {
		return (top + bottom)*height/2;
	}
	

	
	
}
