package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		//성적을 입력받아서 그에 따른 학점 A~F를 출력.
		//10점 단위 등급
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade = 'F';
		if (score >= 90 && score <= 100)
			grade = 'A';
		else if (score >= 80 )	 
			grade = 'B';
		else if (score >= 70 )
			grade = 'C';
		else if (score >= 60 )
			grade = 'D';
		else
			grade = 'E';
			
		System.out.println("학점 : " + grade);	
		
		sc.close();
	}
}
