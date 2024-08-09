package _1000;

import java.util.Scanner;

//길이 n이 입력되면 다음과 같은 사각형을 출력한다.
//
//예)
//
//n이 5일때
//
//*****
//*   *
//*   *
//*   *
//*****
public class _1356 {
	public static void main(String[] args) {
		// 1 <   < n
		// n-2
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	for (int i = 1; i <= n ; i++) {
		if(i==1 || i==n) {
			for (int j = 1; j <=n; j++) {
				System.out.print("*");
			}
	}
		else {
			System.out.print("*");
			for (int j = 1; j <= n-2; j++) {
				System.out.print(" ");
			}
		System.out.print("*");
		}
		System.out.println();
			
}
}
}
