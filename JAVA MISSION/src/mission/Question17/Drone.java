package mission.Question17;

public class Drone implements RemoteControl {

	double battery, speed;
	
	@Override
	public void On() {
		System.out.println("드론 전원 ON");
	}

	@Override
	public void Off() {
		System.out.println("드론 전원 OFF");
	}
	
	@Override
	public void changeBattery() {
		System.out.println("드론 배터리를 교체합니다.");
	}

	@Override
	public void setSpeed(int speed) {
		if(speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
			System.err.println("최대 속력!");
		}
		
		else if(speed < MIN_SPEED) {
			this.speed = MIN_SPEED;
			System.err.println("최저 속력!");
		}
		
		else 
			this.speed =speed;
		System.out.println("현재 속도 : " + this.speed);
	}
	
	
}
