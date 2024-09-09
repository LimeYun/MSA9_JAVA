package mission.Question17;

public class RcCar implements RemoteControl{
	
	double battery, speed;
	
	@Override
	public void On() {
		System.out.println("RC카 전원을 켭니다.");
	}

	@Override
	public void Off() {
		System.out.println("RC카 전원을 끕니다.");
	}
	
	@Override
	public void changeBattery() {
		System.out.println("RC카 배터리를 교체합니다.");
	}

	@Override
	public void setSpeed(int speed) {
		
		if(speed>RemoteControl.MAX_SPEED ) {
			this.speed = RemoteControl.MAX_SPEED;
			System.err.println("최대 속력!");
		}
		
		else if(speed<RemoteControl.MIN_SPEED) {
			this.speed = RemoteControl.MIN_SPEED;
			System.err.println("최저 속력!");
		}
		
		else {
			this.speed=speed;
		}
		System.out.println("현재 속도 : " + this.speed);
	}
	 
}
