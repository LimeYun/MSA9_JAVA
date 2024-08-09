package _1000;

import java.util.Scanner;

//길이 n이 입력되면 역삼각형을 출력한다.
//
//예)
//
//n이 5이면
//
//*****
//****
//***
//**
//*
public class _1354 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		for (int j = (n-i+1); j >=1; j--) {
//			System.out.print("*");
//		}
		
		for (int i =1 ; i <= n; i++) {
			//i :1, j:   1 2  3 4 5
			//i :2, j : 1 2 3 4
			// -- -
			
			// 1 2 3 4 5 : i
			// 5 4 3 2 1 : 6-i
		for (int j =1 ; j <= (n-i+1); j++) {
				System.out.print("*");
 		}System.out.println();
			}
	}
}
