package Day08.Ex02_Multiimplement;

public interface RemoteControl {

	int MAX_VOLUME = 300;
	int MIN_VOLUME = 0;
	
	void trunOn();
	void trunOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
	default void parking(boolean mute) {
		if(mute) {
			System.out.println("음소거 설정 되었습니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("음소가 해제 되었습니다.");
			setVolume(10);
		}
	}
	
	static void changeBatter() {
		System.out.println("배터리 교체");
	}
	
}
