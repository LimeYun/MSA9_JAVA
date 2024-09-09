package mission.Question16;

public abstract class Shape {
	
	 Point point;
	 
	abstract double area(); 	//넓이
	abstract double round();	//둘레
		
	// getter, setter 메소드를 정의하시오.
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
	
}
