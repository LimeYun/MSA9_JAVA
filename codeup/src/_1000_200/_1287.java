package _1000_200;

import java.util.Scanner;

public class _1287 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= n*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
