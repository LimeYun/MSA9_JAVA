package Day03;

import java.util.Scanner;

public class Ex13_Gugu {

	public static void main(String[] args) {
		//구구단 (1~9단)
		//원하는 단을 입력받아 아래와 같이, 구구단 수식을 출력하시오.
		//입력: 4
		//4*1=4 ----
	
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		for (int i = 1; i <=9 ; i++) {
			int result = input * i;
			System.out.println(input + "x"+ i + "="+ result);
		}
		System.out.println();
	}
}
