package _1000_200;

import java.util.Scanner;

public class _1201 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("양수");
		}
		else if(n<0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
	}
	
}
