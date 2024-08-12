package Day06.Ex03_02_AccessModifier;

import Day06.Ex03_01_AccessModifier.Person;

public class Student extends Person {

	//생성자
	
	public Student() {
		
	}

	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}
	
	//메소드
	public void defualtSetting() {
		name = "이름없음"; //public 접근지정자로,모든 곳에서 접근 가능
		age = 20;		//protected 접근지정자로, Person 상속받았기 때문에 다른 패키지라도 접근 가능
		// height = 170;	//다른 패키지이기 때문에 x.
		// weight = 60;	//같은 클래스만 가능하기 때문에 x.
		setHeight(170);
		setWeight(60);
		
	}
	
}
