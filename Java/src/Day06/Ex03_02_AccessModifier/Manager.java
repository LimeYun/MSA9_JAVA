package Day06.Ex03_02_AccessModifier;

import Day06.Ex03_01_AccessModifier.Person;

public class Manager {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.defualtSetting();
		System.out.println("name : "+ student.name);
		System.out.println("age : " + student.getAge());
		// 선언한 클래스를 기준으로 접근지정자가 적용된다.
		// 같은 패키지인 Manager 클래스에서 Student 클래스의 
		// default 접근지정자인  height 를 접근할 수 없는 이유?
		// 선언한 곳인 person 클래스의 패키지와 다른 패키지이다. 고로 x.
		System.out.println("heigth : "+ student.getHeight());
		System.out.println("Weight : " + student.getWeight());
		System.out.println();
		
		
		Person person = new Person();
		System.out.println("name : " + person.name);
		System.out.println("age : "+ person.getAge());
		System.out.println("height : "+ person.getHeight());
		System.out.println("Weight : "+ person.getWeight());
		System.out.println();
		
	}
}
