package Day02;

import java.util.Scanner;

public class Ex08_Triangle {
	public static void main(String[] args) {
		//삼격형 넓이
		// 밑변과 높이를 입력받아서 삼각형의 넓이 계산 및 출력
		
		//1. 밑변과 높이를 입력받는다.		
		//2. 밑변과 높이를 담을 변수를 선언한다
		//3. 삼각형 넓이를 계산한다. 
		//4. 결과를 출력한다.
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변:");
		double width = sc.nextDouble();
		System.out.print("높이:");
		double height = sc.nextDouble();
		
		double area = width * height/2;
		System.out.println("넓이: " + area);
		sc.close();
	}
}
