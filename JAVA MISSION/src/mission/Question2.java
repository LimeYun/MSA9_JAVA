package mission;

import java.util.Scanner;

//정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고, 정수 1부터 N까지 홀수의 합계와 짝수의 합계 그리고 정수 N의 약
//수를 구하여 예시 <출력>과 같이 출력하는 프로그램을 작성하시오. ( 1 ≤ N ≤ 100 )
//
//Copyright c ALOHA CLASS. All Rights Reserved.
//
//• (설명)
//10을 입력받아서,
//1번 줄에는 1~N에 대한 홀수의 수식 및 합계,
//2번 줄에는 1~N에 대한 짝수의 수식 및 합계,
//3번 줄에는 N의 약수를 출력하시오.
//10 
//1+3+5+7+9=25
//2+4+6+8+10=30
//1 2 5 10
public class Question2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			for (int i = 1; i <= N; i++) {
				if(i%2==1) {
					
				}
			}
			
			sc.close();
		}
}
