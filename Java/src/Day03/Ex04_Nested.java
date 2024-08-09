package Day03;

import java.util.Scanner;

public class Ex04_Nested {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//정보처리기사 합격기준
			// 4학년, 40점 이상
			System.out.print("학년: ");
			int year = sc.nextInt();
			System.out.print("점수: ");
			int score = sc.nextInt();
			
			/*if (year == 4) {
				if(score >=60) {
					System.out.println("합격!");
				}
				else {
					System.out.println("불합격");
				}
			} else {
					System.out.println("응시자격이 없습니다.");
				}
		*/
			//solution 1
			if (year == 4 && score >= 60) {
				System.out.println("합격!");
			}
			else if (year == 4 && score < 60) {
				System.out.println("불합격");
			}
			else 
				System.out.println("응시자격이 없습니다.");
			//solution 2
			if (year != 4)
				System.out.println("응시자격이 없습니다.");
			else if (score>= 60)
				System.out.println("합격!");
			else
				System.out.println("불합격");
			
		sc.close();
		}
}
