package mission.Question17;

public class Driver {
	public static void main(String[] args) {
		
		RemoteControl carRC = new RcCar();
		carRC.On();			
//		carRC.parking(false);	
		carRC.setSpeed(100);		
//		carRC.parking(true);	
		carRC.Off();		
		carRC.changeBattery(); 
		
		System.out.println();
		
		RemoteControl droneRc = new Drone();
		droneRc.On();
//		droneRc.parking(false);
		droneRc.setSpeed(80);
//		droneRc.parking(true);
		droneRc.Off();
		droneRc.changeBattery();
		System.out.println();
	}
}
