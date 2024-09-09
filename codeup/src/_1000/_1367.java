package _1000;

import java.util.Scanner;

public class _1367 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int k = sc.nextInt();
		String d = sc.next();
		if(d.equals("L")) {
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= i-1; j++) {	
					System.out.print(" ");
				}
				for (int j = i-1; j <= k+i-2; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if(d.equals("R")) {
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= h-i; j++) {	
					System.out.print(" ");
				}
				for (int j = h-i+1; j <= k+h-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}
}