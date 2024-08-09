package Day03;

import java.util.Scanner;

public class Ex06_Grade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		String grade = sc.next();
		// 문자 정수 문자열은 스위치 문의 조건값으로 가능
		// float double 등 실수는 조건값으로 불가능
		switch (grade) {
			case "A" : System.out.println("90~100점입니다"); break;
			case "B" : System.out.println("80~89점입니다"); break;
			case "C" : System.out.println("70~79점입니다"); break;
			case "D" : System.out.println("60~69점입니다"); break;
			case "F" : System.out.println("60점 미만입니다"); break;
	
			default: System.out.println("A~F 사이의 문자를 입력해주세요");
				break;
		}
		sc.close();
	}
}
