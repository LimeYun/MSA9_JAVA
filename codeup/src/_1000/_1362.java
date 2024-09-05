package _1000;

import java.util.Scanner;

public class _1362 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = n*(n+1)/2;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(sum + " ");
				sum--;
			}
			System.out.println();
		}
	}
}