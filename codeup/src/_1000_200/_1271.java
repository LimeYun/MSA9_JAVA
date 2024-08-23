package _1000_200;

import java.util.Scanner;


public class _1271 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int max = 0;
	
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a>max) {
				max = a;
			}
		}
		System.out.println(max);
		
	}
}
