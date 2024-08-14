package Day08.Ex02_Multiimplement;

public interface Microphone {

	int inputVolumeMax = 50;		//음식 인식 최대 볼륨
	int inputVolumeMin = 0;			//음성 인식 최소 볼륨
	
	 //음성 인식
	String receiveVoice(String voice);
}
