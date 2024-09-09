package mission.Question17;

public interface RemoteControl {
	
	int MAX_SPEED = 200;
	int MIN_SPEED = 0;
	
	void On();
	void Off();
	void setSpeed(int speed);
	void changeBattery();
	
	
	default void parking (boolean check) {
		if(check) {
			System.out.println("주차 되었습니다.");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행 모드를 시작합니다.");
			setSpeed(10);
		}
	}
	
	
}
