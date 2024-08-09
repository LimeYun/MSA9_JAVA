package _1000;

import java.util.Scanner;

//어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
//
//여기서 입력되는 n은 반드시 홀수이다.
//3부터 99 까지의 홀수 중 하나가 입력된다.
//  *
// ***
//*****
public class _1358 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= (n+1)/2; i++) {
			for (int j = 1; j <=(n+1)/2-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
				
			}System.out.println();
			
		}
//n은 홀수다 지정. 
//elseif?
		int arr[]= new int[3];
		arr[0]=34;
		arr[1]=54;
		arr[2]=77;
				
	}
}